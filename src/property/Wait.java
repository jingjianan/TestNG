package property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	private int timeout = 10;
	private WebDriver driver;
	public Wait(WebDriver driver ){
		this.driver = driver;
	}
	//元素 可见
	public void WaitforElementPresent(String locator){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
	
	//元素可用
	public void WaitforElementEnable(String locator){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
}
