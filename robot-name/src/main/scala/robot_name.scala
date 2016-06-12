object Robot {
  private var names:Set[String] = Set()
}


class Robot {
  import Robot._

  def makeName: String = {
    val r = new scala.util.Random
    def randomChar: Char = ('A'.toInt + r.nextInt(26)).toChar
    def randomDigit: Char = ('0'.toInt + r.nextInt(10)).toChar
    var name = "" + randomChar + randomChar + randomDigit + randomDigit + randomDigit
    if (names.contains(name)) {
      makeName
    } else {
      names += name
      name
    }
  }

  def reset():Unit = {
    privateName = makeName
  }

  private[this] var privateName = makeName

  def name: String = privateName
}
