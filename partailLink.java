package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partailLink {

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.partialLinkText("http://www.Seleniu")).click();
		
	//	driver.close();
		
		driver.quit();


	}

}
