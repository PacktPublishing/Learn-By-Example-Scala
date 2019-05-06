
def printPairTypes[K,V](k:K,v:V) = {
  val keyType = k.getClass
  val valueType = v.getClass
  println(s"$k, $v are of types $keyType,$valueType")
} 

printPairTypes(12,"12");


