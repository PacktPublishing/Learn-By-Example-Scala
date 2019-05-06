

class LazyRectangle(l:Double, b:Double) {
  val length = l
  val breadth = b
  val getArea = {println("initialising area"); l*b}
  lazy val perimeter = {println("initialising perimeter"); 2*(length+breadth)}
}

val r = new LazyRectangle(5,20)

