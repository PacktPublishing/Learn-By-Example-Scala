val dayOfWeek = "Friday"

val typeOfDay = dayOfWeek match{
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case someOtherDay => {
     println(s"Some other day - neither Sunday nor Monday, its $someOtherDay")
     someOtherDay
  }
}

val typeOfDay = dayOfWeek match{
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case _ => {
     val errorString = s"Some other day - neither Sunday nor Monday, its $dayOfWeek"
     _
  }
}




