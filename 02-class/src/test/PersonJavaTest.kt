package test

import person.PersonJava

fun main(){
	val javaPerson = PersonJava("Java",17,true)
	
	println(javaPerson.name)
	println(javaPerson.age)
	println(javaPerson.isMarried())
	
}