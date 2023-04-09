package com.example.pair

class MyPair[T](val first:T,val second:T) {
  def small[T](first:T,second:T)(implicit order:T=>Ordered[T]):T={
    if(first < second) first else first
  }
  
}

object MyPair extends App{
  val pair = new MyPair(1,2)
//  val order1 = (x:Int) => Ordered.orderingToOrdered(x)
//  println(pair.small)
  
}