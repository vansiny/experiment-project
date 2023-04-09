package org.hg.entity;

public class Juice extends Liquid{

	@Override
	public String sayColor() {
		System.out.println("I'm juice,my color is red");
		return "juice color red";
	}

}
