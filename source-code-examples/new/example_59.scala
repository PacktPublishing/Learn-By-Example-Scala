

class ComplexNumber(r:Double, i:Double) {
  val realPart = r
  val imaginaryPart = i

  def +(that: ComplexNumber): ComplexNumber = 
      new ComplexNumber(
        this.realPart + that.realPart,
        this.imaginaryPart + that.imaginaryPart
        )    

  override def toString  = s"($realPart,$imaginaryPart)"
}


