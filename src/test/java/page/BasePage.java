package page;

import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	
	public void setWebDriver(WebDriver driver){
		this.driver = driver;
	}
	
}
