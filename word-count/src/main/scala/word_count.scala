class Phrase(phrase: String) {

  val normalizedPhrase = phrase.toLowerCase.replaceAll(",", " ").replaceAll("[\\p{Punct}&&[^']]", "")

  def wordCount: Map[String, Int] = {
    def recursiveWordCount (list: List[String],
                         count: Map[String, Int])
                         : Map[String, Int]
      = list match {
      case word :: rest => {
        if (count.contains(word)) {
          recursiveWordCount( rest, count + (word -> (count(word) + 1)) );
        } else {
          recursiveWordCount( rest, count + (word -> 1));
        }
      }
      case Nil => count
    }
    recursiveWordCount( normalizedPhrase.split("\\s+").toList, Map() );
  }
}
