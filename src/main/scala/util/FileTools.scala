package util

import org.apache.commons.io.IOUtils

trait FileTools {

  def loadFile(fileName: String): String = {
    val cl = getClass.getClassLoader
    IOUtils.toString(cl.getResourceAsStream(fileName))
  }
}
