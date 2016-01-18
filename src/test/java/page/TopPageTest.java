package page;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.util.Map;

public class TopPageTest extends TestBase {
	
	/*
	 * <Available Drivers>
	 * HtmlUnitDriver();
	 * FirefoxDriver();
	 * InternetExplorerDriver();
	 * ChromeDriver();
	 * new RemoteWebDriver(new URL("http://localhost:3001/wd/hub"), DesiredCapabilities.iphone());
	 * */
	private String testURL = "alpha.aegis-wall.com";
	
	
	@Before
	public void setUp(){
		
	}
	
    @Test
	public void topPageContactLinkTestWithFirefox(){
		WebDriver driver = getFireFoxDriver();
		topPageContactLinkTest(driver);
	}
    
    @Test
   	public void topPageContactLinkTestWithIE(){
    	WebDriver driver = getIEDriver();
		topPageContactLinkTest(driver);
   	}
    
    @Test
   	public void topPageContactLinkTestWithChrome(){
    	WebDriver driver = getChromeDriver();
		topPageContactLinkTest(driver);
   	}
    
    
    private void topPageContactLinkTest(WebDriver driver){
		driver.get("https://" + testURL);
		
		TopPage topPage = PageFactory.initElements(driver, TopPage.class);
		
		ContactPage contactPage = topPage.moveContactPage();
		
		assertThat(contactPage.getTitle(), is("Ç®ñ‚Ç¢çáÇÌÇπ"));
		driver.quit();
    }
    
    private WebDriver getFireFoxDriver(){
    	return new FirefoxDriver();
    }
    
    
    
    private WebDriver getIEDriver(){

    	File file = new File("C:/Selenium/IEDriverServer.exe");
    	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
    	WebDriver driver = new InternetExplorerDriver();
    	return driver;
    	
    	/*String PROXY = testURL;
    	
    	org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
    	proxy.setHttpProxy(PROXY)
    	     .setFtpProxy(PROXY)
    	     .setSslProxy(PROXY);
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setCapability(CapabilityType.PROXY, proxy);    	
    	WebDriver driver = new InternetExplorerDriver(cap);
    	*/
    	
    }
    
    private WebDriver getChromeDriver(){
    	File file = new File("C:/Selenium/chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    	WebDriver driver = new ChromeDriver();
    	return driver;
    }
	
    
}
