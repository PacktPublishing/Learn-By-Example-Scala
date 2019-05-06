
val personInfo = ("Vitthal", "Srinivasan", 36, "M")

personInfo

val genderPair = "Vitthal" -> "M"

personInfo.productIterator.foreach{ i => println("Value = " + i )}

val (firstName,lastName,age,gender) = personInfo

def printPersonGender(name:String, gender:String) = println(s"Name:$name M/F:$gender")

(printPersonGender _).tupled(genderPair)

personGender.productArity

