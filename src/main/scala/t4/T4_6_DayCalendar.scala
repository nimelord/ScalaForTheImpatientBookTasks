package t4

import scala.collection.mutable

object T4_6_DayCalendar {

  def getWeekDays: mutable.Map[String, Int] = {
    mutable.LinkedHashMap(
      "Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "Wednesday" -> java.util.Calendar.WEDNESDAY,
      "Thursday" -> java.util.Calendar.THURSDAY,
      "Friday" -> java.util.Calendar.FRIDAY,
      "Saturday" -> java.util.Calendar.SATURDAY,
      "Sunday" -> java.util.Calendar.SUNDAY)
  }

  def apply(): T4_6_DayCalendar = new T4_6_DayCalendar
}

class T4_6_DayCalendar {

  def perform: Unit = {
    println(s"Day Calendar: ${T4_6_DayCalendar.getWeekDays}.")
  }
}
