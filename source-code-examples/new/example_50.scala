
val stateCodes = Map("California" -> "CA", "Vermont" -> "VT")
val stateCode = stateCodes("NoSuchState")
val stateCode = util.try(stateCodes("NoSuchState"))

stateCode match {
  case util.Success(code) => code
  case util.Failure(error) => "something terrible happened!"
}