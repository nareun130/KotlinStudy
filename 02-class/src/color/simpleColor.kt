package color

import color.Color.*
import kotlin.io.println

fun getSimpleWarmth(color: Color) = when (color) {
	RED, YELLOW, ORANGE -> "warm"
	GREEN -> "neutral"
	BLUE, INDIGO, VIOLET -> "cold"
}
fun main(){
	println(getSimpleWarmth(BLUE))
}

