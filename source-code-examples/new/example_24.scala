val area = getRectangleArea(5,8)

def getRectangleArea (length:Double, breadth:Double):Double = {length * breadth}

val area = getRectangleArea(5,8)

val perimeterOfSquare = 20.0

(getRectangleArea _).tupled({val sideOfSquare = perimeterOfSquare/4; (sideOfSquare,sideOfSquare)})
res119: Double = 6.25

