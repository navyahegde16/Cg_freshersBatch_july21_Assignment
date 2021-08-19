package com.test.assign

/* 
 *  Multi-line strings
 *  Make a multi-line string. Compute the number of vowels on each line.
 */

str = '''Hey everyone,
Today we goona learn about groovy and practice the code in eclipse.
Everyone should be ready between the given time.'''
 
//println str

str = str.toLowerCase()
count = 0
//println str
list = []

for (c in str) {
	list.add(c)
}
//println list
size = list.size()
//println size

for (i=0;i<size-1;i++)
if (list[i] =='a' || list[i] =='e' || list[i] =='i' || list[i] =='o' || list[i] =='u') {
	count = count + 1
}
println "In the given sentence vowels are $count"
