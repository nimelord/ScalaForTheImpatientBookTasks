object T2_6_7_UnicodeMultiplication {

	def multiFor(string: String): Long = {
		var result = 1l;
		for (i <- 0 to string.length - 1) {
			result *= string(i).toLong
		}
		result
	}

	def multiFoldLeft(string: String): Long = {
		string.foldLeft(1l)(_ * _.toLong)
	}

	def apply(): T2_6_7_UnicodeMultiplication = new T2_6_7_UnicodeMultiplication
}

class T2_6_7_UnicodeMultiplication {

	def perform {
		val string = "Hello"
		println(s"Unicode multiplication result for string($string):")
		val res0 = T2_6_7_UnicodeMultiplication.multiFor(string)
		println(s"\tvia 'for': $res0")
		val res1 = T2_6_7_UnicodeMultiplication.multiFoldLeft(string)
		println(s"\tvia 'foldLeft': $res1")
	}
}
