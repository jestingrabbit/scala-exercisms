class School {
  var db: Map[Int, Seq[String]] = Map()
  def add(name: String, year: Int): Unit = {
    db = db + (year -> (grade(year) ++ Seq(name)))
  }
  def grade(value: Int) = {
    if (db.contains(value)) {
      db(value)
    } else {
      Seq()
    }
  }
  def sorted: Map[Int, Seq[String]] = {
    val sM = scala.collection.immutable.SortedMap[Int,Seq[String]]()
    sM ++ db.map({case (k, v) => (k -> v.sorted)})
  }
}
