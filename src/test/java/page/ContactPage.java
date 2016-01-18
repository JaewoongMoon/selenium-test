package page;

import org.openqa.selenium.WebDriver;

public class ContactPage {

	private final WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		driver.get(driver.getCurrentUrl() + "/contact/form");
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
}
