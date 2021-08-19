'''
Write a program to read through the mbox-short.txt and figure out the distribution by hour of the day for each of the messages. You can pull the hour out from the 'From ' line by finding the time and then splitting the string a second time using a colon.
From stephen.marquard@uct.ac.za Sat Jan  5 09:14:16 2008
Once you have accumulated the counts for each hour, print out the counts, sorted by hour as shown below
'''

name = input("Enter file:")
if len(name) < 1:
    name = "mbox-short.txt"
    
d = dict()

handle = open(name)
for line in handle:
    if line.startswith("From "):
        words = line.split()
        #print(words)
        time = words[5]
        line=time[0:2]
        d[line]=d.get(line,0)+1

lst=list()        
for v,k in d.items():
    lst.append((v,k))

lst.sort()
for v,k in lst:
    print(v,k)