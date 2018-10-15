package t3

import org.scalatest.FlatSpec

class T3_2_ElementPairReplacerSpec extends FlatSpec {

  "Replacer" should "replace all elements in each 'even = odd' pair." in {
    val res = T3_2_ElementPairReplacer.replace(Array(0, 1, 2, 3, 4))
    assert(res.deep == Array(1, 0, 3, 2, 4).deep)
  }
}
