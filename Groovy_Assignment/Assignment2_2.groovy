package com.test.assign

/* 
 *  Processing a list of numbers
 *  Create a list of numbers. Add them together. First double each number, then add them up. 
 *  Compute their average.
 */

list = [1,2,3,4,5,6]
sum = 0
count = 0
for (i in list) {
	count = count + 1
	i = i ** 2
	sum = sum + i
}
avg = sum / count
println "Average is $avg"
