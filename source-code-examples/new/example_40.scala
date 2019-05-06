
//creating a list
val weekDays = List("Mon","Tue","Wed","Thu","Fri")

val weekDays2 = "Mon" :: "Tue" :: "Wed" :: "Thu" :: "Fri" :: Nil 

val weekendDays = List("Sat","Sun")

val daysAgain = List(weekDays,weekendDays).flatten

val days = weekDays ::: weekendDays

val days = weekDays ++ weekendDays

val dayIndices = List(1,2,3,4,5,6,7)

dayIndices zip allDays