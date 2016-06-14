object Year {
  def apply(year: Int) = new Year(year)
}

class Year(year: Int) {
  def isLeap: Boolean = {
    year % 400 == 0 || year % 4 == 0 && year % 25 != 0
  }
}
