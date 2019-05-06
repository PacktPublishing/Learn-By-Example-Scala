val dayOfWeek = "Friday"

val typeOfDay = dayOfWeek match{
  case "Monday" => "Manic Monday"
  case "Sunday"|"Saturday" => "Lazy weekend"
  case "Tuesday"|"Wednesday"|"Thursday"|"Friday" => "Other working day"
}


val typeOfDay = dayOfWeek match{
  case "Monday" => "Manic Monday"
  case "Tuesday"|"Wednesday"|"Thursday"|"Friday" => "Other working day"
  case someOtherDay if someOtherDay == "Sunday" => "Sleepy Sunday" 
  case someOtherDay if someOtherDay == "Saturday" => "Sizzing Saturday" 
}




