val daysOfWeekList = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun")

for(day <- daysOfWeekList) 
{
day match {
    case "Mon" => println("Manic Monday")
    case otherDay => println(otherDay)
  }
}

val x = for(day <- daysOfWeekList) yield
{
day match {
    case "Mon" => "Manic Monday"
    case otherDay => otherDay
  }
}



