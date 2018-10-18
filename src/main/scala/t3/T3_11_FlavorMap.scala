package t3

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import t3.T3_11_FlavorMap._

import scala.collection.JavaConversions._

object T3_11_FlavorMap {

  def getNatives: Seq[String] = {
    val map = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    map.getNativesForFlavor(DataFlavor.imageFlavor).toSeq
  }

  def apply(): T3_11_FlavorMap = new T3_11_FlavorMap
}

class T3_11_FlavorMap {

  def perform {
    println(s"z = $getNatives")
  }
}
