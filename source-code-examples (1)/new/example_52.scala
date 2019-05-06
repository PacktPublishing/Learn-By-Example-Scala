
class Rectangle(l:Double,b:Double) {
 val length:Double = l
 val breadth:Double = b
 def this(s:Double) = this(s,s)
 def getArea:Double = l * b
 override def toString = s"I am a rectangle, l=$length, b=$breadth"
}

val rect = new Rectangle(4,5)
val rect = new Rectangle(3)
val rectList = List(new Rectangle(3,4),rect)

class Fraction(n:Double,d:Double=1) {
  val numer:Double = n
  val denom:Double = d
  def getFraction = numer/denom

}