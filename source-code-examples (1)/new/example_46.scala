val someNumbers = List(10,20,30,40,50,60)
val weekDays = List("Mon","Tue","Wed","Thu","Fri")
val weekEnds = List("Sat","Sun")

val allDays = weekDays ++ weekEnds

allDays forall (_ != "monday")

allDays endsWith weekEnds

allDays startsWith weekDays
