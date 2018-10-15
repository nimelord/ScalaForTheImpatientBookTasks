package t3

import org.scalatest.FlatSpec

class T3_2_3_ElementPairReplacerSpec extends FlatSpec {

  "Replacer" should "replace all elements in each 'even = odd' pair. in exists array" in {
    val arr = Array(0, 1, 2, 3, 4)
    T3_2_3_ElementPairReplacer.replace(arr)
    assert(arr.deep == Array(1, 0, 3, 2, 4).deep)
  }

  it should "replace2 build new array with replaced elements in each 'even = odd' pair." in {
    val res = T3_2_3_ElementPairReplacer.replace2(Array(0, 1, 2, 3, 4))
    assert(res.deep == Array(1, 0, 3, 2, 4).deep)
  }
}
