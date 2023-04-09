package com.example.entity

trait Fruit {
  val name:String
  val weight:Int
  val color:String
  def say:Unit = println(s"I'm a $color $name, weight:$weight.")
}