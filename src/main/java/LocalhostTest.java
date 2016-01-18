import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocalhostTest  {
   
	public static void main(String[] args) {
        
	
        WebDriver driver = new FirefoxDriver();
    
        driver.get("http://localhost:8080/contact/form");
        
        WebElement e = driver.findElement(By.id("btnConfirm"));
        //e.submit();
        e.click();
        //e.
        
       // WebElement element = driver.findElement(By.name("q")); // Find the text input element by its name

       // element.sendKeys("Cheese!");         // Enter something to search for
        
       // element.submit(); // Now submit the form. WebDriver will find the form for us from the element


        System.out.println("Page title is: " + driver.getTitle());    // Check the title of the page
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        /*
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
         */
        //System.out.println("Page title is: " + driver.getTitle());         // Should see: "cheese! - Google Search"
        
        //driver.quit(); //Close the browser
    }
}