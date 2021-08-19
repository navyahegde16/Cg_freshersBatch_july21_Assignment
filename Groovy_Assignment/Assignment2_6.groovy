package com.test.assign

/* 
 *  Padded binary output
 *  Print the numbers from 0 to 15 in binary (use Java's Integer.toBinaryString() method). Use a 
 *  method in String from the Groovy JDK to make all the output values have four digits.
 */

for (i in 0..15) {
	i = Integer.toBinaryString(i)
	println i.padLeft(4,'0')
}