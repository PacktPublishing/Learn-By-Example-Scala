

def compareStrings(s1:String,s2:String):Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {1}
}

def compareStringsDescending(s1:String,s2:String):Int = {
  if (s1 == s2) 0
  else if (s1 > s2) 1
  else {-1}
}

def smartCompare(s1:String, s2:String, cmpFn:(String,String) => Int):Int = {
  cmpFn(s1,s2)
}

def getComparator(reverse:Boolean):(String,String) => Int = {
   if (reverse == true) compareStringsDescending
   else compareStrings
}
