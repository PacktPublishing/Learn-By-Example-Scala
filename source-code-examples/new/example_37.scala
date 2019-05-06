
def voteForMrTrump(x:String):String = {
  println("go D-J-T")
  x
}

def sayHelloToMrTrump(name: => String):String = {
  println(s"Meet the President!")
  println(s"$name");
  name
}



sayHelloToMrTrump("Vitthal")
sayHelloToMrTrump(voteForMrTrump("Vitthal"))


def sayHelloToMrTrump(name:String):String = {
  println(s"Meet the President!")
  println(s"$name");
  name
}

sayHelloToMrTrump("Vitthal")
sayHelloToMrTrump(voteForMrTrump("Vitthal"))




