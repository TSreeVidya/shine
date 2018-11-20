package com.accent.pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.accent.pkg.Test1;

import junit.framework.Assert;
public class Test2
{
Test1 calculator;
@BeforeClass
public void beforeClass()
{
    //Ideal place to perform some setup which is shared among all tests.
    //E.g. Initializing DB connection, setting environment properties
    System.out.println("@BeforeClass: I run only once, before first test start.");
    calculator = new Test1();
}
@AfterClass
public void afterClass(){
    //Ideal place to perform some cleanup of setup which is shared among all tests.
    System.out.println("@AfterClass: I run only once, after all tests have been done.\n");
    calculator = null;
}
@Test
public void testAdd(){
    System.out.println("@Test add");
    Assert.assertEquals(calculator.add(2, 3), 5.0);
}
 
@Test
public void testSubtract(){
    System.out.println("@Test subtract");
   // Assert.assertTrue(calculator.subtract(5, 3) > 1, "Subtract test failed");
} 
  
}
