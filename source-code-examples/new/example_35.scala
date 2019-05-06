

def compareStrings(s1:String,s2:String):Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {1}
}


def smartCompare(s1:String, s2:String, cmpFn:(String,String) => Int):Int = {
  cmpFn(s1,s2)
}

val defaultCompare = smartCompare(_:String,_:String,compareStrings)
