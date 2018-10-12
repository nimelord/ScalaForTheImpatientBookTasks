package t2

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object T2_11_DateInterpolation {

  val formatter = DateTimeFormatter.ofPattern("DD-MM-YYYY")

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def localDate(args: Any*): String = {
      val strings = sc.parts.iterator
      val expressions = args.iterator
      val buf = new StringBuffer(strings.next)
      while (strings.hasNext) {
        val next = expressions.next
        val result =
          if (next.isInstanceOf[LocalDate]) {
            val localDate = next.asInstanceOf[LocalDate]
            localDate.format(formatter)
          }
          else s"$next"
        buf append result
        buf append strings.next
      }
      buf.toString()
    }
  }

  def format(date: LocalDate): String = {
    localDate"$date"
  }

  def apply(): T2_11_DateInterpolation = new T2_11_DateInterpolation
}

class T2_11_DateInterpolation {

  def perform {
    val date = LocalDate.of(2005, 1, 19)
    val strDate = T2_11_DateInterpolation.format(date)
    println(s"LocalDate($date) formated via custom interpolator as '$strDate'.")
  }
}
