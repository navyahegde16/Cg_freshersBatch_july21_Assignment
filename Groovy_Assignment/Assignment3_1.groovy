package com.test.assign

/* 
 *  Encode and decode
 */

/* i.Create two strings, one for a username and one for a password. Concatenate them together, 
 * separated by a colon. Use a method from the Groovy JDK to convert the resulting String to a byte 
 * array. Then use the encodeBase64 method on byte array to create an encoded string.
 */

String username = "navyahegde16"
String password = "abc123"

auth = username + ":" + password
auth = auth.getBytes()
println "Byte array is $auth"
eb = auth.encodeBase64().toString()
println "Encoded string is $eb"

println "---------------------------------------------------------------------------------------------"

/* 
 * ii.Decode the string by using the decodeBase64 method, and using the result as an argument to the 
 * String constructor. Use the split method to return the original username and password.
 */

db = eb.decodeBase64()
println "Decoded string is $db"
original_auth = new String(db)
result = original_auth.split(":")
println result[0]
println result[1]
