package com.test.assign

/* 
 * Create a list of strings. Sort them alphabetically. Sort them by length. 
 * Sort them by length in descending order.
 * Advanced: Sort by length, then sort equal length strings alphabetically
 */

def list = ["navyaa","kajal","uma","swarali"]
list.sort()
println "sorted alphabetically -> $list"
List sort = list.sort { it.size() }
println "sorted by length -> $sort"
println "sorted in descending order -> " + sort.reverse()