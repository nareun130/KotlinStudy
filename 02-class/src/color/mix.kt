package color

import kotlin.collections.setOf
import color.Color.*

fun mix(c1: Color, c2: Color) =
	when (setOf(c1, c2)) {
		setOf(RED, YELLOW) -> ORANGE
		setOf(YELLOW, BLUE) -> GREEN
		setOf(BLUE, VIOLET) -> INDIGO
		else -> throw Exception("Dirty color")
	}

fun mixOptimized(c1: Color, c2: Color) =
	when {
		(c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
		(c1 == BLUE&& c2 == YELLOW) || (c1 == BLUE && c2 == YELLOW ) -> GREEN
		(c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
		else -> throw Exception("Dirty color")
	}

fun main() {
	println(mix(YELLOW, BLUE)) //GREEN
	println(mixOptimized(BLUE,YELLOW))
}