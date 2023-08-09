package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName2 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("dineshkalekar33@gmail.com");
		
	
		driver.findElement(By.name("pass")).sendKeys("Sunnydinu@33");
		
		
		WebElement tagname=driver.findElement(By.tagName("button"));
		tagname.click();


	}

}
