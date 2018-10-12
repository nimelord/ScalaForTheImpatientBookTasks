package t2

import t2.T2_10_ComplicatedRecursion.pow

object T2_10_ComplicatedRecursion {


	def pow(x: Double, n: Int): Double = {
		n match {
			case nn if (nn == 0 && x == 0) => throw new IllegalArgumentException("Result of pow(0, 0) is undefined!")
			case nn if (nn == 0) => 1
			case nn if (nn == 1) => x
			case nn if (nn < 0) => 1 / pow(x, -nn)
			case nn if (nn % 2 == 0) => {
				val buff = pow(x, nn / 2)
				buff * buff
			}
			case nn if (nn % 2 == 1) => x * pow(x, nn - 1)
			case nn => throw new IllegalArgumentException(s"$nn is not supported yet")
		}
	}

	def apply() : T2_10_ComplicatedRecursion = new T2_10_ComplicatedRecursion
}

class T2_10_ComplicatedRecursion {

	def perform {
		val x = 12
		val n = 14
		val res = pow(x, n)
		println(s"Result of pow($x, $n) = $res.")
	}
}
