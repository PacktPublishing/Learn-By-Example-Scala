def fraction(numer:Double,denom:Double): Option[Double] = {
if (denom == 0) 
  None 
else 
  Option(numer/denom)
}

piOption match
{
  case Some(pi) => pi
  case None => "Something bad happened"
}