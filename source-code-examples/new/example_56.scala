
abstract class Shape(name:String) {
  val shapeName = name
  override def toString = s"I am a $shapeName"
  def getArea:Double
} 

val someShape:Shape = new Shape("Irregular shape") {
  def getArea = 100
}


class Rectangle(l:Double, b:Double, shapeName:String="Rectangle") extends Shape(shapeName) {
  val length = l
  val breadth = b
  override def toString = s"I am a $shapeName, l=$length, b=$breadth" 
  def getArea = l*b
}

class Square(s:Double) extends Rectangle(s,s,"Square") {
}

class AreaCalculator[T] (s:T) {
  val shape:T = s
  override def toString = shape.toString
}

val s = new Shape("Circle")
val r = new Rectangle(5,20)