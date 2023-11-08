package test

import person.PersonJava

fun main() {
	val javaPerson = PersonJava("Java", 17, true)
	println("변경전")
	println(javaPerson.name)
	println(javaPerson.age)
	println(javaPerson.isMarried)
	
	//~>코틀린에서는 setAge(21)대신 이런식으로 값 변경 
	javaPerson.age = 21
	javaPerson.isMarried = false
	
	println("변경후")
	println(javaPerson.name)
	println(javaPerson.age)
	println(javaPerson.isMarried)
}
