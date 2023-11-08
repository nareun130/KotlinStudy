package person

class PersonKotlin(
	//* 기본이 val(읽기 전용 형태, java에서의 final)로 지정하고 쓴다. -> 함수형 프로그래밍과 연
	val name: String,
	val int: Integer,
	//* var : 읽고 쓰기 가능 
	var isMarried: Boolean

)
