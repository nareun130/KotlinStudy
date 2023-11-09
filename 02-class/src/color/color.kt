package color

enum class Color(
	val r: Int, val g: Int, val b: Int
) {
	RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(
		75,
		0,
		130
	),
	VIOLET(238, 130, 238); //* enum클래스 안에서 메소드를 정의하는 경우 반드시 enum 상수 목록과 메소드 정의 사이에 세미콜론 넣어야 함.

	//* enum클래스 안에서 메소드 정의 
	fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
	println(Color.BLUE.rgb())
}