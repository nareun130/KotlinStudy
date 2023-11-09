package cast

//(1+2)+4 연산하는 함수
//* 식을 트리구조로 저장 
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

//fun eval(e: Expr): Int {
//	if (e is Num) {
//		val n = e as Num //? Num타입으로 변환 -> 불필요한 중복 
//
//		return n.value
//	}
//	if (e is Sum) {
//		return eval(e.right) + eval(e.left) //~> 변수 e에 대해 스마트 캐스트를 사용 
//	}
//	throw IllegalArgumentException("Unkown expression")
//}

//* 리팩토링 : eval-if
//fun eval(e: Expr): Int =
//	if (e is Num) e.value
//	else if (e is Sum) eval(e.left) + eval(e.right)
//	else throw IllegalArgumentException("Unknown expression")

//* 리팩토링 : eval-when
fun eval(e: Expr): Int =
	when (e) {
		is Num -> e.value
		is Sum -> eval(e.left) + eval(e.right)
		else -> throw IllegalArgumentException("Unknown expression")
	}

//* 분기에 복잡한 동작이 있는 when 사용
fun evalWithLogging(e: Expr): Int =
	when (e) {
		is Num -> {
			println("num:${e.value}")
			e.value
		}
		is Sum -> {
			val left = evalWithLogging(e.left)
			val right = evalWithLogging(e.right)
			println("sum:${left} + ${right}")
			left + right //! 블록이 본문인 함수는 내부에 반드시 return문이 존재해야 함.
		}
		else -> throw IllegalArgumentException("Unknown expression")
	}

fun main() {
	println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))
	println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(3))))
	
}