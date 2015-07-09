package property;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PropertyTest {
	WebDriver driver;
	ParseProperties data;
	ParseProperties locator;
	Wait wait; 
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  data = new ParseProperties(System.getProperty("user.dir")+"/tool/test.properties");
	  locator = new ParseProperties(System.getProperty("user.dir")+"/tool/locator.properties");
	  wait = new Wait(driver);
	  
	  }
  
  @Test
  public void test() {
	  driver.get(data.getValue("url"));
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  WebElement user = driver.findElement(By.xpath(locator.getValue("loc_username")));
	  user.clear();
	  user.sendKeys(data.getValue("username"));
	  WebElement pwd = driver.findElement(By.xpath(locator.getValue("loc_password")));
	  pwd.clear();
	  pwd.sendKeys(data.getValue("password"));
	  WebElement submit = driver.findElement(By.xpath(locator.getValue("loc_submit")));
	  submit.click();
//	  wait.WaitforElementPresent(locator.getValue("xxx"));
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//  Assert.assertEquals(expected, actual);
  }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
