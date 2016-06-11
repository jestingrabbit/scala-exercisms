class Phrase(phrase: String) {

  val normalizedPhrase = phrase
                           .toLowerCase
                           .replaceAll(",", " ")
                           .replaceAll("[\\p{Punct}&&[^']]", "")
                           .split("\\s+")
                           .toList

  val wordCount = normalizedPhrase
                    .map( {word => (word, normalizedPhrase.count {otherWord => word == otherWord})})
                    .toMap

}
