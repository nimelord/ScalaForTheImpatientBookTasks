package t3

import org.scalatest.FlatSpec
import util.ArrayTools

import scala.collection.mutable.ArrayBuffer

class T3_8_RemoveNegativeValuesExceptFirstSpec extends FlatSpec with ArrayTools {

  "Removing of negative values except first" should "return exact result" in {
    val buff = ArrayBuffer(4, 6, 3, -1, 3, -7, 5, 4, 34, -8, -7)
    T3_8_RemoveNegativeValuesExceptFirst.removeNegatives(buff)
    assert(buff.toArray.deep == Array(4, 6, 3, -1, 3, 5, 4, 34).deep)
  }
}
