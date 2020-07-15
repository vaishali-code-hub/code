package com.test.Test2;

import com.test.Test1.Bird;

public class Duck  extends Bird implements Soundable{
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void makeSound() {
		System.out.println("Quack,quack");
		
	}
}
