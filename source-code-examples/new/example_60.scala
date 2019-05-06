
class Shape(name:String) {
  protected val shapeName = name
  override def toString = s"I am a $shapeName"
} 


class Rectangle(l:Double, b:Double, shapeName:String="Rectangle") extends Shape(shapeName) {
  val length = l
  val breadth = b
  private val diagLen = math.sqrt(length*length + breadth*breadth)
  override def toString = s"I am a $shapeName,diagonal = $diagLen" 
}


class Square(s:Double) extends Rectangle(s,s,"Square") {
   // override def toString = s"I am a $shapeName, l=$length, b=$breadth, diagonal = $diagLen" 
 override def toString = s"I am a $shapeName, l=$length, b=$breadth" 
}



val r = new Rectangle(5,20)
val s = new Square(10) 