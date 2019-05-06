
case class Person(firstName:String, lastName:String)

val person1 = Person("Vitthal","Srinivasan")
val person2 = Person("Janani","Ravi")

person1.firstName

person1 match {
  case Person("Vitthal","Srinivasan") => "Humpty-Dumpty"
  case x => x.firstName
}
