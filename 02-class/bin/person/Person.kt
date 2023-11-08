class Person(//~> kotlin의 기본 가시성은 public
    //* 읽기만 가능
    val name:String, //~> 기본적으로 val로 선언
    //* 읽고 쓰기 가능
    var isMarried : Boolean
)