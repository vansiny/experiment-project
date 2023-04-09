package com.example.singletonObject

class DemoPhone (
  private val user: String,
  private val num: Int){
  println("traditional:"+user+"'s number is "+num)
  println(s"new way:$user's number is $num")

  //companion class can visit private member of companion object
  def getName = DemoPhone.user

  def getNum:Option[Int] = {
    if(2<2) return None
    Some(3)
  }

  def getNum1:Integer = {
    if(1<2) return null
    3
  }
}

object DemoPhone extends App {
  private val user:String = "Mike"
  var phone1: DemoPhone=new DemoPhone ("Jim",12345)
  //companion object can access private member of companion class
  println(phone1.num)
  println(phone1.getName)

  object CellPhone extends DemoPhone("Tom",1234)
  var num = CellPhone.getNum
  if(num.isEmpty) println("empty")
  if(num.nonEmpty) println(" non empty")
  println(num)
  var num1 = CellPhone.getNum1
  println(num1)
  val names = Set("Jim","John","Tom")
  val names1 = names + "Jim"
  var list1 = Nil
   var list2 = 3::4::5::list1
  list2 = 1::2::list2
  println(names1.toString())
  println(list2)

}
