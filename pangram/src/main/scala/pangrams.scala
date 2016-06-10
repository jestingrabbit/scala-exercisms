object Pangrams {
  val numberOfLetters = 26
  def isPangram(str: String): Boolean = {
    str.toLowerCase.replaceAll("[^a-z]", "").toSet.size == numberOfLetters
  }
}
