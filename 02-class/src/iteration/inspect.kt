package iteration

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'z'//~> 'a'<=c && c<='z'로 변환됨.
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
	in '0'..'9' -> "It's a digit!"
	in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
	else -> "I don't know.."
}

fun main() {
	println(isLetter('q'))
	println(isNotDigit('x'))
	println(recognize('0'))
}