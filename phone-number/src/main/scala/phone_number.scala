class PhoneNumber(input: String) {
  val number: String = {
    val number = input.replaceAll("\\D", "")
    if (number.length == 10) {
      number
    } else if (number.length == 11 && number.head == '1') {
      number.drop(1)
    } else {
      "0" * 10
    }
  }
  val numberPattern = "(\\d\\d\\d)(\\d\\d\\d)(\\d\\d\\d\\d)".r
  val numberPattern(areaCode, middleThree, lastFour) = number
  override val toString = s"($areaCode) $middleThree-$lastFour"
}
