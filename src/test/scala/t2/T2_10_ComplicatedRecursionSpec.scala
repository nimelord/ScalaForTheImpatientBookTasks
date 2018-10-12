package t2

import org.scalatest.FlatSpec
import utils._

class T2_10_ComplicatedRecursionSpec extends FlatSpec with FloatPointComparator {

	"Complicated Recursion pow(..)" should "exception if call function(0, 0)" in {
		val e = intercept[IllegalArgumentException] {
			T2_10_ComplicatedRecursion.pow(0, 0)
		}
		assert(e.getMessage == "Result of pow(0, 0) is undefined!")
	}

	it should "return 1 for any x and zero exponent" in {
		assert(T2_10_ComplicatedRecursion.pow(45, 0) == 1)
		assert(T2_10_ComplicatedRecursion.pow(-837, 0) == 1)
	}

	it should "return inversely value for negative exponent" in {
		val arguments = Array(45, 6, 2);
		val exponents = Array(1, 2, 5);
		for (x <- arguments; e <- exponents) {
			val negativeResult = T2_10_ComplicatedRecursion.pow(x, -e)
			val positiveResult = T2_10_ComplicatedRecursion.pow(x, e)
			val revN = 1 / negativeResult
			assert( ~=(positiveResult, revN), s"pow($x, $e) has incorrect behaviour: negativeResult($negativeResult), positiveResult($positiveResult), 1/n:($revN)")
		}
	}

	it should "return expected result for defined invariant" in {
		verify(1, 0, 1)
		verify(5, 0, 1)
		verify(234, 0, 1)

		verify(0, 1, 0)
		verify(0, 3, 0)
		verify(0, 100, 0)

		verify(1, 1, 1)
		verify(1, 2, 1)
		verify(1, 200, 1)

		verify(2, 2, 4)
		verify(2, 3, 8)
		verify(2, 10, 1024)

		verify(3, 2, 9)
		verify(3, 5, 243)

		verify(5, -2, 1.0 / 25)
		verify(5, -3, 1.0 / 125)
	}

	def verify(x: Double, n: Int, result: Double) {
		val res = T2_10_ComplicatedRecursion.pow(x, n);
		assert(~=(res, result), s"function($x, $n) = $res, but expected $result")
	}
}
