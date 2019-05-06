
object NYTimesAccount {
  private val userName = "vitthal"
  private val password = "boo"
  
  def apply() = new NYTimesAccount

}

class NYTimesAccount {
  private val accountDetails = Map(
    "user" -> NYTimesAccount.userName,
    "password" -> NYTimesAccount.password 
  )
  println(s"Hi " + accountDetails("user"))
}

val nytAccount = NYTimesAccount()