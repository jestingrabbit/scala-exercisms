object Hamming {
  def compute(str1: String, str2: String): Int = {
    require(str1.length == str2.length)
    (str1 zip str2).count( {case (c1, c2) => c1 != c2 } )
  }
}
