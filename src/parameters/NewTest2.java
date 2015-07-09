package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

//TestNG 对testng.xml 的参数的类型指定的值会自动尝试转换。
//下面是支持的类型：String,int/Integer,boolean/Boolean,byte/Byte,char/Character,double/Double,float/Float,long/Long,short/Short
public class NewTest2 {
/*	WebDriver driver = null;
  @BeforeMethod
  public void beforeMethod() {
	//	driver = new FirefoxDriver();
	  System.out.println("----------beforeMethod-------");
	  }*/
  @Parameters({"test-name","num","flag","char","float"})
  @Test
  public void f1(@Optional("aaa") String testname,@Optional("2")Integer number,Boolean flag,Character c,Float f) {
	    System.out.println(System.getProperty("user.dir")+"----"+testname+"---"+number+"--"+flag);
	    System.out.println("Character is "+c);
	    System.out.println("float is "+f);
	  
  }
 /* @AfterMethod(groups="browser")
  public void afterMethod() {
	//  driver.quit();
	  System.out.println("----------afterMethod-------");
  }*/

}

