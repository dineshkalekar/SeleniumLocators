package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.linkText("Create a Page")).click();
		
	//	driver.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click();

	}

}
