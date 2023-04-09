package com.example.checkcases.variance

import com.example.entity.BlackApple
import org.hg.entity.{Apple, Fruit, Juice, Liquid}


object TestMain extends App {
//  print(args)
  val apple = new Apple()
  val liquidMachine = (apple:Apple)=>new Liquid()
  val juiceMachine = (fruit:Fruit)=>new Juice()

  private def appleToLiquid(machine:Apple=>Liquid):Liquid={
    machine(apple)
  }

  val fromLiquidMachine = appleToLiquid(liquidMachine)
  fromLiquidMachine.sayColor()

  val fromJuiceMachine = appleToLiquid(juiceMachine)
  fromJuiceMachine.sayColor()

  private def checkUp[T>:com.example.entity.Apple](apple:T): Unit = {
    println(apple)
  }

  private def checkDown[T <: com.example.entity.Apple](apple: T): Unit = {
    apple.showColor()
  }

  val blackApple = new BlackApple()
  val fruitb: com.example.entity.Fruit = new BlackApple()
  checkUp(fruitb)
  checkUp(blackApple)
  println("==========================")
  checkDown(blackApple)
//  checkDown(fruitb)

}
