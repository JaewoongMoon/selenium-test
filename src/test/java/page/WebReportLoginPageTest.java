package page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebReportLoginPageTest extends TestBase {

	private String testURL = "https://10.32.14.143/webreport";
	
	private WebDriver driver;
	
	
	@Before
	public void setUp(){
		driver = getIEDriver();
	}
	
	private void doLogin(){
		driver.get(testURL + "/index.ds");
		WebReportLoginPage loginPage = PageFactory.initElements(driver, WebReportLoginPage.class);
		loginPage.login("admin", "wpGd&0318");
	}
	
	@Test
	public void menuLength(){
		doLogin();
		driver.get(testURL + "/report/viewerSetup.ds");
		DBMSAuthPolicy page = PageFactory.initElements(driver, DBMSAuthPolicy.class);
		page.moveThisPage();
		page.setStateFilter("DISABLE");
		page.search();
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
		//driver.close();
	}
	
	
	
}
