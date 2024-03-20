package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.cssSelector("a[href=\"/windows\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();

		Set<String> windows = driver.getWindowHandles(); 

		Iterator<String> it = windows.iterator();
		String Parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example'] /h3")).getText());
		driver.switchTo().window(Parentwindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example'] /h3")).getText());

	}

}
