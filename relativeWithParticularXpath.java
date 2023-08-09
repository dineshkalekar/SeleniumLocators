package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeWithParticularXpath {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("(//*[contains(@name,'login')])[2]")).click(); // xpath reletive with  particular element


	}

}
