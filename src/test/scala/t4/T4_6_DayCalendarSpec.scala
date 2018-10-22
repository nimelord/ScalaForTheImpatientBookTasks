package t4

import org.scalatest.FlatSpec
import util.TupleValidator

class T4_6_DayCalendarSpec extends FlatSpec with TupleValidator {

  "DayCalendar" should "keep correct order" in {
    val days = T4_6_DayCalendar.getWeekDays
    validate(days.iterator)
  }

  def validate(it: Iterator[(String, Any)]): Unit = {
    validate(it.next(), "Monday", 2)
    validate(it.next(), "Tuesday", 3)
    validate(it.next(), "Wednesday", 4)
    validate(it.next(), "Thursday", 5)
    validate(it.next(), "Friday", 6)
    validate(it.next(), "Saturday", 7)
    validate(it.next(), "Sunday", 1)
  }
}
