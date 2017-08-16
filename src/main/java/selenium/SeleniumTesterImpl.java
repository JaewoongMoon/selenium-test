package selenium;
/**

 * @ SeleniumTesterImpl.java
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * <pre>
 * 
 * SeleniumTesterImpl.java 
 * </pre>
 *
 * @brief	: 
 * @author	: Jae-Woong Moon(mjw8585@gmail.com)
 * @Date	: 2017/08/15
 */
public class SeleniumTesterImpl implements SeleniumTester {

	protected WebDriver webDriver;
	/**
	 * @Method 	: getWebDriver
	 * @brief	: 
	 * @author	: Jae-Woong Moon(mjw8585@gmail.com)
	 * @Date	: 2017/08/15
	 * @return
	 */
	public WebDriver getWebDriver() {
		return webDriver;
	}
	
	/**
	 * @Method 	: setWebDriver
	 * @brief	: 
	 * @author	: Jae-Woong Moon(mjw8585@gmail.com)
	 * @Date	: 2017/08/15
	 * @param webDriver
	 */
	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void setProxy(String proxyAddress){
		String PROXY = proxyAddress;
		if(proxyAddress == null || proxyAddress.equals("")){
			PROXY = "127.0.0.1:8082";
		}
		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
		proxy.setHttpProxy(PROXY)
		     .setFtpProxy(PROXY)
		     .setSslProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
	}
}
