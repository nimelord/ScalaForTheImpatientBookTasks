package t2

import java.time.LocalDate

import org.scalatest.FlatSpec

class T2_11_DateInterpolationSpec extends FlatSpec{

	"Date interpolation" should "return expect format of date" in {

		val date = LocalDate.of(2018, 1, 2)
		val strDate = T2_11_DateInterpolation.format(date)
		assert(strDate == "02-01-2018", s"unexpected format: $strDate")
	}
}
