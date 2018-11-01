package t6

import org.scalatest.FlatSpec

class T6_8_ColorCubeSpec extends FlatSpec {

  it should "return name by id" in {
    assert(T6_8_ColorCube.byId(0x000000).toString == "black")
    assert(T6_8_ColorCube.byId(0x0000ff).toString == "blue")
    assert(T6_8_ColorCube.byId(0x00ff00).toString == "green")
    assert(T6_8_ColorCube.byId(0xff0000).toString == "red")
    assert(T6_8_ColorCube.byId(0xffffff).toString == "white")
  }
}
