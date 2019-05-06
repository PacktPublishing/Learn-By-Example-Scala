val daysOfWeekList = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun")

for(day <- daysOfWeekList) {
  println(day)
}

for(i <- 0 until daysOfWeekList.size) {
  println(daysOfWeekList(i))
}


for(i <- 0 to daysOfWeekList.size - 1) {
  println(daysOfWeekList(i))
}


val x = for(day <- daysOfWeekList) yield
{
day match {
    case "Mon" => "Manic Monday"
    case otherDay => otherDay
  }
}





