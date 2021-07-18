object Q1 extends App{
  def prime(x:Int,i:Int=2): Boolean =x match {
    case x if (x<=1) =>false
    case x if (x==2) =>true
    case x if (x%i==0) => false
    case x if (i*i>x) => true
    case x => prime(x,i+1)
  }
  println(prime(5))
  println(prime(8))
}
