package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://rahulshettyacademy.com/angularpractice/");
       
       driver.findElement(By.cssSelector("[minlength='2']")).sendKeys("Sudhakar");
       
       driver.findElement(By.name("email")).sendKeys("sudhakar2604@yopmail.com");
       
       driver.findElement(By.id("exampleInputPassword1")).sendKeys("Welcome@1");
       
       driver.findElement(By.id("exampleCheck1")).click();
   
       WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));  
       
       Select Gender = new Select(dropdown);
       
       Gender.selectByIndex(0);
       
       driver.findElement(By.id("inlineRadio2")).click();
       
       driver.findElement(By.name("bday")).sendKeys("12-11-2000");
		
	   driver.findElement(By.cssSelector("[value='Submit']")).click();
	   
	  System.out.println(driver.findElement(By.cssSelector("[class*='alert']")).getText());
	  	

	}

}
