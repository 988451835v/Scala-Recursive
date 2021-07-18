object Q5 extends App{
  def isEven(n:Int):Boolean =n match{
    case 0=>true
    case _=>isOdd(n-1)
  }

  def isOdd(n:Int):Boolean= !(isEven(n))


  def sum_eve(x:Int) : Int ={
    if (x<2) 0
    else if (isEven(x))  {x-2 + sum_eve(x - 2)}
    else  {x-1 + sum_eve(x - 1)}
  }
  println(sum_eve(8))
  print(sum_eve(5))
}





