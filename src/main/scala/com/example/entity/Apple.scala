package com.example.entity

class Apple extends Fruit{
  val name="Apple"
  val weight=8
  val color="green"

  def showColor(): Unit = {
    println(s"$name color is $color")
  }
}