package com.test.assign

/* 
 *  Prime Numbers
 *  Write a method called isPrime that takes an integer argument and returns a boolean. Determine 
 *  whether the number is prime by dividing it by all numbers from 2 up to one less than the number.
 *  That limit is too high, of course. How high do you have to check to be sure whether you've gone far 
 *  enough?
 */

def isPrime(int a) {
	if (a<2) {
		return false
	}
	for (int i=2;i<a;i++) {
		if (a % i == 0) {
				return false;
			}
	}
	return true
}
result = isPrime(1999)
println result