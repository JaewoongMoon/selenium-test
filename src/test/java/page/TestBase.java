package page;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	protected ThreadLocal<RemoteWebDriver> threadDriver = null;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		 
        threadDriver = new ThreadLocal<RemoteWebDriver>();
        DesiredCapabilities dc = new DesiredCapabilities();
        FirefoxProfile fp = new FirefoxProfile();
        dc.setCapability(FirefoxDriver.PROFILE, fp);
        dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
        
        threadDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc));
    }
	
	 public WebDriver getDriver() {
       return threadDriver.get();
	 }
	 
	
    @AfterMethod
    public void closeBrowser() {
    	System.out.println("browser Quit!");
        getDriver().quit();
 
    }
    
    public WebDriver getFireFoxDriver(){
    	return new FirefoxDriver();
    }
    
    
    
    public WebDriver getIEDriver(){

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
    
    public WebDriver getChromeDriver(){
    	File file = new File("C:/Selenium/chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    	WebDriver driver = new ChromeDriver();
    	return driver;
    }
	
}


