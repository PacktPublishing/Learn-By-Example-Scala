

class LazyRectangle(l:Double, b:Double) {
  val length = l
  val breadth = b
}

class AreaCalculator {
  def apply(s:LazyRectangle) = s.length * s.breadth
}

val lazyRect = new LazyRectangle(4,5)
val areaCalc = new AreaCalculator()
areaCalc(lazyRect)

