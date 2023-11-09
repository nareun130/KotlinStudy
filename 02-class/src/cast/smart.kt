package cast

//(1+2)+4 연산하는 함수
//* 식을 트리구조로 저장 
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
	if (e is Num) {
		val n = e as Num //? Num타입으로 변환 -> 불필요한 중복 

		return n.value
	}
	if (e is Sum) {
		return eval(e.right) + eval(e.left) //~> 변수 e에 대해 스마트 캐스트를 사용 
	}
	throw IllegalArgumentException("Unkown expression")
}

fun main() {
	println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}