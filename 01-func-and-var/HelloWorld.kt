// !. 함수를 최상위 수준에 정의 가능
fun main(args: Array<String>) {
    // * println처럼 자 라브리 함수를 간결하게 사용할 수  있게 감싼 Wrapper 클래스 제공 */
    println("Hello world!")
}

//* 블록이 본문인 함수
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
//* 식이 본문인 함수 
//!. 식이 본문인 함수는 타입을 추론해준다. : Int가 없어도 됨.
fun min(a:Int, b:Int) = if(a<b) a else b