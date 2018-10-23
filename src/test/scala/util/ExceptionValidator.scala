package util

import org.scalatest.Assertions.intercept

import scala.reflect.ClassTag

trait ExceptionValidator {

  def validateException[E <: Throwable](f: => Any)(msg: String)(implicit classTag: ClassTag[E]): Unit = {
    val e = intercept[E] {
      f
      None
    }
    assert(e.getMessage == msg, s"Expected \n'$msg',\nbut was \n'${e.getMessage}'.")
  }
}
