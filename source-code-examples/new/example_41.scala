
//creating a list
val weekDays = List("Mon","Tue","Wed","Thu","Fri")

weekDays.head
weekDays.tail

weekDays.size
weekDays.reverse
weekDays.reverse

weekDays(1)

weekDays.contains("Mon")
weekDays contains "Mon"


for (c <- weekDays) println(c)

weekDays.size

var restOfWeek = weekDays
while (! restOfWeek.isEmpty) 
{
  println(s"Grr..today is ${restOfWeek.head}, ${restOfWeek.size} days left for the weekend")
  restOfWeek = restOfWeek.tail
}

var restOfWeek = weekDays
while (restOfWeek != Nil)
{
  println(s"Grr..today is ${restOfWeek.head}, ${restOfWeek.size} days left for the weekend")
  restOfWeek = restOfWeek.tail 
}

val weekEnds = List("Sat","Sun")
val weeklyHolidays = List("Sat","Sun")
weekEnds == weeklyHolidays

weekDays.distinct
