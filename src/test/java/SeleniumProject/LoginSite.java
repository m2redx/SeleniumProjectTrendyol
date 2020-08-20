package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import junit.framework.Assert;

public class LoginSite {

	
	public static void main (String[] arg) {			
	}
	
	public void PrepareLogin(WebDriver driver) {
		driver.findElement(By.className("icon-container")).click();
		
	}
	public void EnterCredential(WebDriver driver, String username, String password) {
		
		WebElement tb_username = driver.findElement(By.name("email"));
		tb_username.sendKeys(username);
		WebElement tb_password = driver.findElement(By.name("password"));
		tb_password.sendKeys(password);
		driver.findElement(By.id("loginSubmit")).click();
	}
	public void validateLogin(WebDriver driver) {
		
		System.out.print("VALIDATION");
		Boolean loggedIn = driver.findElement(By.id("logged-in-container")).getAttribute("id") == "logged-in-container";
		Assert.assertEquals(true, loggedIn.booleanValue());
		
	}
}
