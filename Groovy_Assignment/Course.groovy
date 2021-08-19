package com.test.assign

/* Create a class called Course, with a String attribute called name and an int attribute called days.
 * Create a list of four course instances, where at least two have the same number of days.
 * Sort the list by number of days. Then, sort the list by days, but when the days are equal, sort by name.
 */

class Course {
	String name;
	int days;
	
def getvalues(String n, int d) {
	def name = n
	def days = d
	def l = [name:n,days:d]
}
	
static void main(args) {

	Course c1 = new Course();
	Course c2 = new Course();
	Course c3 = new Course();
	Course c4 = new Course();
	
	def list = [c1.getvalues('Python',5), c2.getvalues('Groovy',2), c3.getvalues('Git',2), c4.getvalues('Jenkins',4) ]
	
	def sort = list.sort{a,b->b["days"]<=>a["days"]?:a["name"]<=>b["name"]}
	sort.each { println it }
}
}