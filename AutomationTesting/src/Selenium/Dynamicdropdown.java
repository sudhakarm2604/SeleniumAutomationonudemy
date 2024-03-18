package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
     	driver.findElement(By.xpath("//input[@value='Jaipur (JAI)']")).click();
	//	Thread.sleep(2000);
     //	driver.findElement(By.xpath("(//div[contains(text(),'Chennai')])[1]")).click();
    //    System.out.println(driver.findElement(By.xpath("//input[@value='Jaipur (JAI)']")).getText());
		
	}

}
