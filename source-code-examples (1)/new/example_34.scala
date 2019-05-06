

def IsSpecialName(firstName:String, lastName:String):Boolean = {
  firstName == "Donald" && lastName == "Trump"
}

def IsVIP(firstName:String, lastName:String, IsHighStatus:(String,String) => Boolean):Boolean = {
  IsHighStatus(firstName,lastName)
}

IsVIP("Donald","Trump", IsSpecialName)

IsVIP("Donald","Truman",_ == "Donald" && _ == "Trump")




