package t6

object T6_8_ColorCube extends Enumeration {

  // I'm too lazy to define all cube vertices. That doesn't matter.
  val black = Value(0x000000)
  val blue = Value(0x0000ff)
  val green = Value(0x00ff00)
  val red = Value(0xff0000)
  val white = Value(0xffffff)

  val cache = initCache()

  type ColorVertex = Value

  private[this] def initCache(): Map[Int, ColorVertex] = {
    T6_8_ColorCube.values.map(v => (v.id, v)).toMap
  }

  def byId(id: Int): ColorVertex = {
    val result = cache.getOrElse(id, null);
    if (result == null) {
      throw new IllegalArgumentException(s"Incorrect vertex id $id.")
    }
    result
  }

  def perform: Unit = {
    println("All defined colors:")
    values.foreach(v => {
      println(s"The vertex '${v.toString}' has id(${v.id.toHexString}).")
    })
  }
}
