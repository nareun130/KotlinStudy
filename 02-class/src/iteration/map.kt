package iteration

import java.util.TreeMap
import kotlin.collections.arrayListOf


val binaryReps = TreeMap<Char, String>()

fun main() {
	for (c in 'A'..'F') {
		val binary = Integer.toBinaryString(c.toInt())
//		binaryReps[c] = binary  //* 구조 분해 방식 
		binaryReps.put(c, binary)//위와 동일 
	}

	for ((letter, binary) in binaryReps) {
		println("$letter = $binary")
	}
	
	val list = arrayListOf("10","11","1001")
	//* 구조 분해 
	for((index,element)in list.withIndex()){
		println("$index: $element")
	}
}