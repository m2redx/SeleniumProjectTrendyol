package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {
 
	
	public static void main (String[] arg) {
		
		
		
		WebDriver driver = new ChromeDriver();
		EnterSite newEnterSite = new EnterSite();
		newEnterSite.PrepareSite(driver);
		LoginSite newLoginSite = new LoginSite();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		newLoginSite.PrepareLogin(driver);
		newLoginSite.EnterCredential(driver,"kirmizimertmurat@gmail.com", "1998murat");
		newLoginSite.validateLogin(driver);
		SearchProduct newSearchProduct =new SearchProduct();
		newSearchProduct.Search(driver, "Bilgisayar");
		
		
	}
	
	
	
}
