package util

trait ValidationTools {

  def checkArgument(condition: Boolean, msg: String): Unit = {
    if (!condition) throw new IllegalArgumentException(msg)
  }
}
