val someNumbers = collection.immutable.List(10,20,30,40,50,60)
val stateCodes = collection.immutable.Map("California" -> "CA",("Vermont","VT"))
val stateSet = collection.immutable.Set("California","Vermont")

val someNumbers = collection.mutable.Buffer(10,20,30,40,50)
val stateCodes = collection.mutable.Map("California" -> "CA",("Vermont","VT"))
val stateSet = collection.mutable.Set("California","Vermont")

val listBuilder = List.newBuilder[Int]
someNumbers.foreach(listBuilder+=_) 
val reconstructedList = listBuilder.result
