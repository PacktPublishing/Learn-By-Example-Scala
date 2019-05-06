
//creating a list
val weekDays = List("Mon","Tue","Wed","Thu","Fri")

weekDays.foreach(println(c))

val printValue = (x:Any) => {println(x)}:Unit

weekDays.map(_ == "Mon")

val IsManicMonday = (x:String) => {x == "Mon"}:Boolean

weekDays.map(IsManicMonday)

weekDays.filter(IsManicMonday)

weekDays.map(_ != "Mon")

weekDays.sortBy(_(0))