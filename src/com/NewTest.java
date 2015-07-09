package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  @Test
  public void Test1() {
	  System.out.println("Test1");
  }
  @Test
  public void Test2() {
	  System.out.println("Test2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

}
