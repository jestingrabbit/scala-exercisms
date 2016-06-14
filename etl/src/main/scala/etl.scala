object ETL {
  def transform(data: Map[Int, Seq[String]]): Map[String, Int] = {
    data.flatMap {case (i, seq) => seq.map({str => (str.toLowerCase, i)})}
  }
}
