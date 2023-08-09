package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorTagNameClass {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.olx.in/en-in");
		
		//syntax= tagName#id
		
		driver.findElement(By.cssSelector("input._1dasd")).click();
		
//		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("Sunnydinu@33");
//		
//	//	driver.findElement(By.cssSelector("button#u_0_5_Ia")).click(); // login is dynamic .so we can not use cssSelector.
//		
//		driver.findElement(By.name("login")).click();
		

	}

}
