
class Shape(name:String) {
  val shapeName = name
  override def toString = s"I am a $shapeName"
} 


class Rectangle(l:Double, b:Double, shapeName:String="Rectangle") extends Shape(shapeName) {
  val length = l
  val breadth = b
  override def toString = s"I am a $shapeName, l=$length, b=$breadth" 
}

class Square(s:Double) extends Rectangle(s,s,"Square") {

}



val s = new Shape("Circle")
val r = new Rectangle(5,20)