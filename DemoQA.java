package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.className("card-up")).click();
		
		
		
		

	}

}
