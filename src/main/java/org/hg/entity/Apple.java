package org.hg.entity;

public class Apple implements Fruit{

	@Override
	public String sayName() {
		System.out.println("I'm an apple!");
		return "apple";
	}

}
