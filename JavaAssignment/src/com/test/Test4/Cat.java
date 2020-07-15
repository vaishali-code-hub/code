package com.test.Test4;

import com.test.Test1.Animal;
import com.test.Test2.Soundable;

public class Cat extends Animal implements Soundable{

	public void makeSound() {
		System.out.println("Meow");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}