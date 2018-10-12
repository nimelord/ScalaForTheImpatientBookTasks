package utils

import scala.math.abs

trait FloatPointComparator {

	def ~=(v1: Double, v2: Double) = {
		if (v1 != v2) {
			val accuracyMultiplier = 0.00000001
			val absDiff = abs(v1 - v2)
			val absV1 = abs(v1)
			val absV2 = abs(v2)
			absV1 * accuracyMultiplier > absDiff && absV2 * accuracyMultiplier > absDiff
		} else true
	}
}
