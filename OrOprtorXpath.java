package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrOprtorXpath {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//button[@type='submit'or@name='lo']")).click(); // xpath using OR Orators



	}

}
