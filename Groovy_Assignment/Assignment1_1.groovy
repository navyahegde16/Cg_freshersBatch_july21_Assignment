package com.test.assign

/* 
 * 1.a What data type is the number 2? How about 20? 200? 
 * Keep adding zeros and 
 * watch the data type change until it reaches BigInteger. 
 * Then do the same for 2.0.
 */

a = 2000000000
print "From 2 to $a the data type is "
println a.getClass()
println "----------------------------------------------------"
b = a.toString() + "0"
c = 2000000000000000000
print "From $b to $c the data type is "
println c.getClass()
println "----------------------------------------------------"
d = 20000000000000000000
print "From $d the data type is "
println d.getClass()
println "----------------------------------------------------"
e = 2.0
print "From $e the data type is "
println e.getClass()
println "***************************************************"


/* 1.b Declare a variable x of type def and assign it the sum of 1 and 1.5. 
 * What is the resulting data type?
 */

def x = 1 + 1.5
print "The value of x = 1 + 1.5 is $x and data type is "
println x.getClass()
println "***************************************************"

/* 1.c What do you get when you divide 5 by 2? What is the resulting data type? 
 * If you wanted to do integer division (no remainder), what method would you call?
 */

x = 5 / 2
print "The value of x = 5/2 is $x and data type is "
println x.getClass()
x = 5.(intdiv)2
println "The value of x after using intdiv method is $x"