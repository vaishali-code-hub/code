package com.test.TestCases;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import com.test.Test1.Bird;
import com.test.Test2.Chicken;
import com.test.Test2.Duck;
import com.test.Test3.Rooster;
import com.test.Test4.Cat;
import com.test.Test4.Dog;
import com.test.Test4.Parrot;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SolutionTest extends TestCase
{
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
// assigning the values
   protected void setUp(){
	   System.setOut(new PrintStream(outContent));
   }
   
   /**
    * Create the test case
    *
    * @param testName name of the test case
    */
   public SolutionTest( String testName )
   {
       super( testName );
   }

   /**
    * @return the suite of tests being tested
    */
   public static Test suite()
   {
       return new TestSuite( SolutionTest.class );
   }

 
   public void testApp()
   {
   	testForFirst();
   	testForSecond();
   	testForThree();
   	
   }
   
   public void testForFirst()
   {
	   //Question1 testing
	assertTrue( true );
	Bird bird = new Bird();
	bird.walk();
	bird.fly();
	bird.sing();
	assertEquals("Iamwalking\n" +
           	"Iamflying\n" +
           	"IamSinging",outContent.toString().trim().replace(" ", ""));
	outContent.reset();
   }
   
   public void testForSecond()
   {
 //question 2 testing
	assertTrue( true );
	Duck duck = new Duck();
	duck.makeSound();
   duck.swim();
   Chicken chicken =new Chicken();
   chicken.makeSound();
	assertEquals("Quack,quack\n" +
           	"Iamswimming\n" +
           	"Cluck,cluck",outContent.toString().trim().replace(" ", ""));
	outContent.reset();
   }
   public void testForThree()
   {
 //Question3 testing
	assertTrue( true );
   Rooster rooster = new Rooster();
   rooster.makeSound();
	assertEquals("Cock-a-doodle-doo"
           	
           	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
   }
   
   
   public void testForFour()
   {
 //question 4 testing
	assertTrue( true );
	Parrot parrot1 = new Parrot(new Dog());
    parrot1.getDog().makeSound();
    Parrot parrot2 = new Parrot(new Cat());
    parrot2.getCat().makeSound();
    Parrot parrot3 = new Parrot(new Rooster());
    parrot3.getRooster().makeSound();
    Parrot parrot4 = new Parrot(new Duck());
    parrot4.getDuck().makeSound();
	assertEquals("Woof,woof\n" +
           	"Meow\n" +
           	"Cock-a-doodle-doo\n" + 
           	"Quack,quack",outContent.toString().trim().replace(" ", ""));
	outContent.reset();
   }

}
