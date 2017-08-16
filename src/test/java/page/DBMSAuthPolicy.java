package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DBMSAuthPolicy {

	private final WebDriver driver;
	
	public DBMSAuthPolicy(WebDriver driver) {
		this.driver = driver;
	}
	
	public void moveThisPage(){
		driver.findElement(By.id("menu_A102")).click();
	}
	
	public void setStateFilter(String state){
		
		Select select = new Select(driver.findElement(By.id("useStatusSelbox")));
		//select.deselectAll();
		select.selectByValue(state);
		System.out.println(select.getFirstSelectedOption());
	}
	
	public void search(){
		driver.findElement(By.id("inquiryButton")).click();
	}
	
}
