package com.test.Test1;

public class Bird extends Animal implements Flyable{

	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public  void walk() {
	
		System.out.println("I am walking");
	}

	public  void sing() {
		
		System.out.println("I am Singing");
	}


}
