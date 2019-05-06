
val PI = 3.14

val r = 10

def getcircleArea(r:Double):Double = PI * r * r

val calcCircleArea = getCircleArea

val calcCircleArea: (Double) => Double = getCircleArea

val calcCircleArea = getCircleArea _


def getPI() = {PI}

val calcPI: () => Double = getPI

val calcPI = getPI _

def getRectangleArea(l:Double,b:Double):Double = l*b

val calcRectangleArea:(Double,Double) => Double = getRectangleArea

val calcRectangleArea = getRectangleArea _
