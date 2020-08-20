package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchProduct {

	public static void main (String[] arg) {			
	}
	public void Search(WebDriver driver ,String product) {
		
		WebElement tb_product = driver.findElement(By.className("search-box"));
		tb_product.sendKeys(product);
		driver.findElement(By.className("search-icon")).click();

	}
	
	
	
}
