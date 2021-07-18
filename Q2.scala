import scala.collection.immutable._
object Q2 extends App {
  def prime(x: Int, i: Int = 2): Boolean = x match {
    case x if (x <= 1) => false
    case x if (x == 2) => true
    case x if (x % i == 0) => false
    case x if (i * i > x) => true
    case x => prime(x, i + 1)
  }

  def primeSeq(n: Int) {
    if (n > 2)
      primeSeq(n - 1)
    if (prime(n)) {
      print(n)
      print(" ")
    }

  }

  primeSeq(10)
}
