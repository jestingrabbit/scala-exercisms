class DNA(basesString: String) {
  val baseList = basesString.toList
  val countStart = Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)
  val nucleotideCounts = counter( baseList, countStart )
  
  def counter(list: List[Char], map: Map[Char, Int]): Map[Char, Int] = {
    list match {
      case char :: rest => counter( rest, map + (char -> (map(char) + 1)))
      case Nil => map
    }
  }
}
