package util

trait TupleValidator {

  def validate[K, V](a: (K, V), key: K, value: V): Unit = {
    assert(a._1 == key && a._2 == value, s"Incorrect tuple(${a._1} -> ${a._2}), but expected($key -> $value)")
  }
}
