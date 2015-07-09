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
	//Ԫ�� �ɼ�
	public void WaitforElementPresent(String locator){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
	
	//Ԫ�ؿ���
	public void WaitforElementEnable(String locator){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
}
