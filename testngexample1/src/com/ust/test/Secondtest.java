package com.ust.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Secondtest {
	 @Test(priority=1,description="this is excecuted firt")
	  public void f() {
		  System.out.println("from test method f()");
	  }
	  @Test(priority=2,description="this is excecuted second")
	  public void a() {
		  System.out.println("from test method a()");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("from before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("from after test.");
	  }

	}

