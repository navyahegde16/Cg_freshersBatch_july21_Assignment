import sqlite3

sqliteConnection = sqlite3.connect('emaildb.sqlite')
cursor = sqliteConnection.cursor()

cursor.execute('''DROP TABLE IF EXISTS Counts''')

cursor.execute('''CREATE TABLE Counts (org TEXT, count INTEGER)''')

fname = input('Enter file name: ')
if (len(fname) < 1): fname = 'mbox.txt'
fh = open(fname)
for line in fh:
    if not line.startswith('From: '): continue
    pieces = line.split()
    email = pieces[1]
    # change in logic
    parts = email.split('@')
    org = parts[-1]
    print(org)
    cursor.execute('SELECT count FROM Counts WHERE org = ? ', (org,))
    row = cursor.fetchone()
    if row is None:
        cursor.execute('''INSERT INTO Counts (org, count) 
                VALUES ( ?, 1 )''', (org,))
    else:
        cursor.execute('UPDATE Counts SET count=count+1 WHERE org = ?',
                    (org,))
    # This statement commits outstanding changes to disk each
    # time through the loop - the program can be made faster
    # by moving the commit so it runs only after the loop completes
    sqliteConnection.commit()

# https://www.sqlite.org/lang_select.html
sqlstr = 'SELECT org, count FROM Counts ORDER BY count DESC LIMIT 10'

print("Counts:")
for row in cursor.execute(sqlstr):
    print(str(row[0]), row[1])

cursor.close()
