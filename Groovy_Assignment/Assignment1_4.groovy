package com.test.assign

/*
 * Strings and GroovyStrings
 */
 
/* 4.a. How many characters are in the string "Hello, Groovy!"?
 */

s = "Hello, Groovy!"
println "The number of characters in $s is " + s.length()

println "*************************************************************"

/* 
 * 4.b Define a string variable containing a name. 
 * Print a hello statement with your name using string concatenation, 
 * then using a Groovy string.
 */

name = "Navya"
println "Hello $name"

println "*************************************************************"

/*
 * 4.c Demonstrate that "racecar" is a palindrome by comparing it to its reverse. 
 * Do the same with "Bob", removing case sensitivity first.
 */

p1 = "racecar"
r1 =  p1.reverse()
if (p1 == r1) {
	println "racecar is palindrome"
} else {
	println "racecar is not a palindrome"
}

println "--------------------------------------------------------------------"

p2 = "Bob"
r2 = p2.reverse()
if (p2.equalsIgnoreCase(r2)) {
	println "Bob is palindrome"
} else {
	println "Bob is not a palindrome"
}

println "*************************************************************"

/* 
 * 4.d Define a string variable containing the sentence, 
 * "Hello, World. How are you?". 
 * Split the sentence into an array using the split method. 
 * Count the number of words. 
 * Do the same using the tokenize method.
 */

str = "Hello, World. How are you?"
a = str.split(" ")
println "The count of words after spliting the sentence is " + a.size()

println "----------------------------------------------------------------"

def tokenize(str) {
	println "The count of words after spliting the sentence in method is " + str.split(" ").size()
}
tokenize(str)

println "*************************************************************"

/* 
 * 4.e. Using the same sentence, use array notation (square brackets) to print the substring "World".
 */

println a[1]

println "*************************************************************"

/* 
 * 4.f Use array notation to print the last word, but reversed.
 */

println a[4].reverse()
