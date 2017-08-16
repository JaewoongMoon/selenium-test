package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @ FirefoxSeleniumTester.java
 */

/**
 * <pre>
 * 
 * FirefoxSeleniumTester.java 
 * </pre>
 *
 * @brief	: 
 * @author	: Jae-Woong Moon(mjw8585@gmail.com)
 * @Date	: 2017/08/15
 */
public class FirefoxSeleniumTester extends SeleniumTesterImpl{

	public FirefoxSeleniumTester() {
		System.setProperty("webdriver.gecko.driver", "target/classes/geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		webDriver = new FirefoxDriver(cap);
	}
	
	
}
