package org.hg.main;

import java.util.function.Function;

import org.hg.entity.Apple;
import org.hg.entity.Fruit;
import org.hg.entity.Juice;
import org.hg.entity.Liquid;

public class FunctionTest {
	private static Apple apple = new Apple();
	private static Function<Fruit,Juice> juiceMachine = x->new Juice();
	private static Function<Apple,Liquid> liquidMachine = x->new Liquid();
	
	private static Liquid appleToLiquid(Function<Apple,Liquid> function) {
		return function.apply(apple);
	}
	
	private static <T extends Liquid> T appleToLiquidGeneric(Function<? super Apple,T> function) {
		return function.apply(apple);
	}
	
	public static void main(String[] args) {
		Liquid liquid = appleToLiquid(liquidMachine);
		liquid.sayColor();
		
		Juice juice = appleToLiquidGeneric(juiceMachine);
		juice.sayColor();
		
		Liquid liquid2 = appleToLiquidGeneric(liquidMachine);
		liquid2.sayColor();
	}

}
