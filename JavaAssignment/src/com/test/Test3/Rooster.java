package com.test.Test3;

import com.test.Test2.Chicken;
import com.test.Test2.Soundable;

public class Rooster extends Chicken implements  Soundable{
	
	public void makeSound() {
		
		System.out.println("Cock-a-doodle-doo");
	}


}
