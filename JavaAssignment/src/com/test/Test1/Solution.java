package com.test.Test1;

import com.test.Test2.Chicken;
import com.test.Test2.Duck;
import com.test.Test3.Rooster;
import com.test.Test4.Cat;
import com.test.Test4.Dog;
import com.test.Test4.Parrot;

public class Solution {

	public static void main(String[] args) {
	
		// 1 
    	System.out.println("Question1 output:");
    	
   	 	 Bird bird = new Bird();
         bird.walk();
         bird.fly();
         bird.sing();
         
         // 2
         System.out.println("Question2 output:");
        Duck duck = new Duck();
        Chicken chicken =new Chicken();
        duck.swim();
        duck.makeSound();
        chicken.makeSound();
        
        //3 for Rooster used interface
       
        System.out.println("Question3 output:");
       Rooster rooster = new Rooster();
       rooster.makeSound();
       //Question 4
       System.out.println("Question4 output:");
       Parrot parrot1 = new Parrot(new Dog());
       parrot1.getDog().makeSound();
       Parrot parrot2 = new Parrot(new Cat());
       parrot2.getCat().makeSound();
       Parrot parrot3 = new Parrot(new Rooster());
       parrot3.getRooster().makeSound();
       Parrot parrot4 = new Parrot(new Duck());
       parrot4.getDuck().makeSound();
       
	}

}
