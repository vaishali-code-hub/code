package com.test.Test1;

import com.test.Test2.Chicken;
import com.test.Test2.Duck;
import com.test.Test3.Rooster;

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
        
        
	}

}
