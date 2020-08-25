package com.test.Jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestJnekins
{
  @Test
  public void a()
  {
	  Reporter.log("a method printing", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b method printing", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c method printing", true);
  }
}
