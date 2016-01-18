package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopPage {

	private final WebDriver driver;
	
	public TopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public ContactPage moveContactPage(){
	
		 driver.findElement(By.className("btn--style04")).click();
		 
		return new ContactPage(driver);
	}
	
	
}
