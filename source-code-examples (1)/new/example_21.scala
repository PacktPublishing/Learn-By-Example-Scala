val daysOfWeekList = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun")

for(day <- daysOfWeekList) 
{
day match {
    case "Mon" => println("Manic Monday")
    case otherDay => println(otherDay)
  }
}

var x = 0; while(x < daysOfWeekList.size-1) {
x+=1
val day = daysOfWeekList(x)
day match {
    case "Mon" => "Manic Monday"
    case otherDay => otherDay
  }
}

var x = 0; while(x < daysOfWeekList.size-1) {
x+=1
val day = daysOfWeekList(x)
println(day)
}



