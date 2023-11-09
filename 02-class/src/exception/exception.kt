package exception

import java.io.BufferedReader
import java.lang.NumberFormatException
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
	val number = try {
		Integer.parseInt(reader.readLine())
	} catch (e: NumberFormatException) {
//		return
		null // * 예외 발생하면서 null 값을 사용 
	}
	println(number)
}

fun main() {
	val reader = BufferedReader(StringReader("not a number"))
	readNumber(reader)
}
