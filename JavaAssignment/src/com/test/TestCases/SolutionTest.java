package com.test.TestCases;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import com.test.Test1.Bird;

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
   	testForfirst();
  
   	
   }
   
   public void testForfirst()
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
   

}
