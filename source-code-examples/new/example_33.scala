

object Example1 extends App {

  def getComparator() = {
    def compareStrings(s1: String, s2: String): Int = {
      if (s1 == s2) 0
      else if (s1 > s2) -1
      else {
        1
      }
    }
    val compareStringsLiteral = (s1: String, s2: String)  =>  {
      if (s1 == s2) 0
      else if (s1 > s2) -1
      else 1

    }:Int

    def smartCompare(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
      cmpFn(s1, s2)
    }
    smartCompare("abc", "xyz", compareStrings)
    compareStringsLiteral
  }

  def smartCompare2(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
    cmpFn(s1, s2)
  }
  val stringComparator = getComparator()
  // smartCompare2("abc", "xyz", compareStrings) // won't compile
  smartCompare2("abc", "xyz", stringComparator)
}
