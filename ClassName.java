package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement Swapnil=driver.findElement(By.className("gLFyf"));
		Swapnil.sendKeys("Selenium IDE");
		
		WebElement click =driver.findElement(By.className("gNO89b"));
		click.click();
		
		
		
		
		

	}

}
