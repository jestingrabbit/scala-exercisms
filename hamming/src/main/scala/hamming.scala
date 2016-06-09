object Hamming {
  def compute(str1: String, str2: String): Int = {
    if (str1.length != str2.length) {
      throw new java.lang.IllegalArgumentException
    }
    str1.toList.zip(str2.toList).filter( {case (c1, c2) => c1 != c2 } ).length
  } // a lot of action in the last line, but I think its pretty clear.
}
