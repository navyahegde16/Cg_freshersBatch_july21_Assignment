package com.test.assign

/* 
 *  Reading a web page
 *  Using the Groovy JDK, access your home page and display the source code. Print the length of each line 
 *  of the home page.
 */

String filepath = "C:/navya_docs/Cg Assignments/Groovy Assignments/GroovyAssignment/src/com/test/assign/file1.txt"
File myFile = new File(filepath)
myFile.withReader { reader ->
	while ((line = reader.readLine()) != null) {
		println "$line"
		println line.length()
	}
}