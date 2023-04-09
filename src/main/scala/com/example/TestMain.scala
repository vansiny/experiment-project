package com.example

import org.hg.entity.Apple
import org.hg.entity.Liquid
import org.hg.entity.Fruit
import org.hg.entity.Juice

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
