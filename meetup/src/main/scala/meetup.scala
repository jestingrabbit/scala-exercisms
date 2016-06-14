import java.util.Calendar
import java.util.GregorianCalendar

object Meetup {
  val Year = Calendar.YEAR
  val Month = Calendar.MONTH
  val date = Calendar.DAY_OF_MONTH
  val dayOfWeekInMonth = Calendar.DAY_OF_WEEK_IN_MONTH
  val dayOfTheWeek = Calendar.DAY_OF_WEEK

  val Sun = 1  // values returned by cal.get(Meetup.dayOfTheWeek)
  val Mon = 2
  val Tue = 3
  val Wed = 4
  val Thu = 5
  val Fri = 6
  val Sat = 7

  def apply(num: Int, year: Int): Meetup = new Meetup(num, year)
}

class Meetup(num: Int, year: Int) {
  def teenth(dayOfTheWeek: Int): GregorianCalendar = {
    val thirteenth = new GregorianCalendar(year, num -1, 13)
    val thirteenthDay = thirteenth.get(Meetup.dayOfTheWeek)
    new GregorianCalendar(year, num -1, 13 + ((dayOfTheWeek - thirteenthDay + 7) % 7))
  }
  def first(dayOfTheWeek: Int): GregorianCalendar = {
    var cal = new GregorianCalendar(year, num-1, 1)
    cal.set(Meetup.dayOfWeekInMonth, 1)
    cal.set(Meetup.dayOfTheWeek, dayOfTheWeek)
    cal
  }
  def second(dayOfTheWeek: Int): GregorianCalendar = {
    var cal = new GregorianCalendar(year, num-1, 1)
    cal.set(Meetup.dayOfWeekInMonth, 2)
    cal.set(Meetup.dayOfTheWeek, dayOfTheWeek)
    cal
  }
  def third(dayOfTheWeek: Int): GregorianCalendar = {
    var cal = new GregorianCalendar(year, num-1, 1)
    cal.set(Meetup.dayOfWeekInMonth, 3)
    cal.set(Meetup.dayOfTheWeek, dayOfTheWeek)
    cal
  }
  def fourth(dayOfTheWeek: Int): GregorianCalendar = {
    var cal = new GregorianCalendar(year, num-1, 1)
    cal.set(Meetup.dayOfWeekInMonth, 4)
    cal.set(Meetup.dayOfTheWeek, dayOfTheWeek)
    cal
  }
  def last(dayOfTheWeek: Int): GregorianCalendar = {
    var cal = new GregorianCalendar(year, num-1, 1)
    cal.set(Meetup.dayOfWeekInMonth, -1)
    cal.set(Meetup.dayOfTheWeek, dayOfTheWeek)
    cal
  }
}
