package SeleniumProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EnterSite {

	public static void main (String[] arg) {
		
	}
	public void PrepareSite(WebDriver driver) 
	{

		driver.get("https://www.trendyol.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("homepage-popup-gender")).click(); 
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    //driver.findElement(By.id("logo")).click();
		
	}
}
