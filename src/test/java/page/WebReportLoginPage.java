package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebReportLoginPage extends BasePage {

	
	private final WebDriver driver;
	
	public WebReportLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void login(String id, String pw){
		if(driver == null){
			System.out.println("Driver is Null!!!");
		}
		driver.findElement(By.id("userid")).sendKeys(id);
		driver.findElement(By.id("userpw")).sendKeys(pw);
		driver.findElement(By.id("loginSubmitBtn")).click();
	}
	
	
}
