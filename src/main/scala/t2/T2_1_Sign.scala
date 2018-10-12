package t2

import t2.T2_1_Sign.sign

import scala.util.Random

object T2_1_Sign {

  def sign(value: Int): Int = if (value > -1) 1 else -1;

  def apply(): T2_1_Sign = new T2_1_Sign
}


class T2_1_Sign {

  val i = new Random(System.currentTimeMillis()).nextInt();

  def perform() {
    println(f"Sign of ${i} is: ${sign(i)}")
  }

}
