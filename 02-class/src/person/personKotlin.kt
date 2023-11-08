package person

class PersonKotlin( //~> kotlin의 기본 가시성은 public
	//* 기본이 val(읽기 전용 형태, java에서의 final)로 지정하고 쓴다. -> 함수형 프로그래밍과 연
	val name: String,
	val int: Int,
	//* var : 읽고 쓰기 가능 
	var isMarried: Boolean

)
