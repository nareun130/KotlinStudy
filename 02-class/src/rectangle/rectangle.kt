package rectangle

import java.awt.Rectangle

class Rectangle(val height: Int, val width: Int) {
	//* 커스텀 게터 
	val isSquare: Boolean
		//		get() {
//			return height == width₩
//		}
		//* 이렇게 식이 본문인 방식으로 사용가능 
		get() = height == width
}
