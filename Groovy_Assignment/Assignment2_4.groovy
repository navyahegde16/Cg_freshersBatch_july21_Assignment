package com.test.assign

/* 
 *  Closures as a filter
 *  Create a list of numbers. Print all elements greater than zero.
 */

list = [4,-2,5,-2,-8,8,3,2]

println list.findAll { item -> item > 0 }