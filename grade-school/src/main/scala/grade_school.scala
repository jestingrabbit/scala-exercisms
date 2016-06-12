class School {
  def db: Map[Int, Seq[String]] = dbPrivate

  def add(name: String, year: Int): Unit = {
    dbPrivate += (year -> (grade(year) :+ name))
  }

  def grade(value: Int): Seq[String] = dbPrivate.getOrElse(value, Seq())

  def sorted: Map[Int, Seq[String]] = {
    val sM = scala.collection.immutable.SortedMap[Int,Seq[String]]()
    sM ++ dbPrivate.map({case (k, v) => (k -> v.sorted)})
  }

  private[this] var dbPrivate: Map[Int, Seq[String]] = Map()
}
