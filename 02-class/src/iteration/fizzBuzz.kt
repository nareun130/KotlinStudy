package iteration

fun fizzBuzz(i: Int) = when {
	i % 15 == 0 -> "FizzBuzz "
	i % 3 == 0 -> "Fizz "
	i % 5 == 0 -> "Buzz "
	else -> "$i "
}

fun main() {
	for (i in 1..100) {//1~100
		print(fizzBuzz(i))
	}
	println()

	for (i in 100 downTo 1 step 2){ // 100~1 -2 씩 감소, until은 끝 값 포함 x
		print(fizzBuzz(i))
	}
}
