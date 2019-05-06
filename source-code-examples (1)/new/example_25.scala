
def getRectangleArea(length:Double, breadth:Double) = {
   println(s"l = $length,b = $breadth");
   length * breadth
}
getRectangleArea(5,10)
getRectangleArea(breadth=5,length=10)

val getRectangleArea = (length:Double, breadth:Double) => {
   println(s"l = $length,b = $breadth");
   length * breadth
}

getRectangleArea(5,10)
getRectangleArea(breadth=5,length=10) //won't compile


