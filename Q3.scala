object Q3 extends App{
  def sum(x:Int):Int={
    if(x==1)1
    else x+sum(x-1)

  }
  print(sum(5))
}


