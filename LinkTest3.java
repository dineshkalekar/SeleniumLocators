package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://eportal.incometax.gov.in/iec/foservices/#/login");
		
      String title=driver.getTitle();
      System.out.println(title);
      
      

	}

}
