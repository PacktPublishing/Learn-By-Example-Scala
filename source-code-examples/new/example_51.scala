
class Rectangle(l:Double,b:Double) {
 val length:Double = l
 val breadth:Double = b
 def getArea:Double = l * b
 override def toString = s"I am a rectangle, l=$length, b=$breadth"
}

val rect = new Rectangle(4,5)

val rectList = List(new Rectangle(3,4),rect)
