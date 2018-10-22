package util

trait TupleValidator {

  def validate[F, S](a: (F, S), first: F, second: S): Unit = {
    val t = (first, second)
    assert(a == t, s"Incorrect tuple($a), but expected($t)")
  }

  def validate[F, S, T](a: (F, S, T), first: F, second: S, third: T): Unit = {
    val t = (first, second, third)
    assert(a == t, s"Incorrect tuple($a), but expected($t)")
  }
}
