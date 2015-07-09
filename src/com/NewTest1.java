package com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class NewTest1 {
	WebDriver driver = null;
	
  @Parameters({"browsers"})
  @BeforeMethod(groups="browser")
  public void beforeMethod(@Optional("firefox") String browser) {
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equals("IE")){
			driver = new InternetExplorerDriver();
		}else{
			driver = new ChromeDriver();
		}			
	  }

  @Test(groups="baidu")
  public void f1() {
	    System.out.println("----------baidu-------");
	  
  }
  @Test(groups="bing")
  public void f2() {
	  driver.get("http://www.bing.com");
	  System.out.println("----------bing-------");
  }
  @Test(groups="so")
  public void f3() {
	  driver.get("http://www.so.com");
	  System.out.println("----------so-------");
  }
  

  @AfterMethod(groups="browser")
  public void afterMethod() {
	  driver.quit();
  }

}
