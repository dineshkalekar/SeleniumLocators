package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//syntax= tagName#id
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("dineshkalekar33@gmail.com");
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Sunnydinu@33");
		
	//	driver.findElement(By.cssSelector("button#u_0_5_Ia")).click(); // login is dynamic .so we can not use cssSelector.
		
		driver.findElement(By.name("login")).click();
		
		
		

	}

}
