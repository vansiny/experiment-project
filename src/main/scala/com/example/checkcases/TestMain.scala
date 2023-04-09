package com.example.checkcases

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

}
