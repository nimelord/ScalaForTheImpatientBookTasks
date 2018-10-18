package t3

import org.scalatest.FlatSpec

class T3_11_FlavorMapSpec extends FlatSpec {

  "FlavorMap" should "return exact map" in {
    val map = T3_11_FlavorMap.getNatives
    assert(map == Seq("image/png", "image/x-png", "image/jpeg", "image/gif", "PNG", "JFIF"))
  }
}
