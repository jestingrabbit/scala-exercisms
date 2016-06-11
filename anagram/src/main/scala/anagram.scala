class Anagram(word: String) {

  val wordLowerCased = word.toLowerCase
  val letterCount = letterCounter(wordLowerCased)

  def letterCounter(word: String): Map[Char, Int] = {
    val charList = word.toLowerCase.toList
    charList.map( {char => (char, charList.count {c=> c == char})}).toMap
  }

  def matches(seq: Seq[String]): Seq[String] = {
    seq.filter {otherWord =>
      var otherWordLC = otherWord.toLowerCase;
      (letterCounter(otherWordLC) == letterCount) && (otherWordLC != wordLowerCased)}
  }

}
