package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
		
		//syntax= tagName#id
		
	//	driver.findElement(By.cssSelector("input[placeholder=Username]")).sendKeys("Admin");

		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("dineshkalekar33@gmail.com");
		
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Sunnydinu@33");
		
		driver.findElement(By.cssSelector("button[type=submit]")).click();

	}

}
