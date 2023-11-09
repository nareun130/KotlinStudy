package color

fun getMnemonic(color: Color) =
	when (color) {
		Color.RED -> "RICHARD"
		Color.ORANGE -> "Of"
		Color.YELLOW -> "York"
		Color.GREEN -> "Gave"
		Color.BLUE -> "Battle"
		Color.INDIGO -> "In"
		Color.VIOLET -> "Vain"
	}

fun main(){
	println(getMnemonic(Color.BLUE))
}