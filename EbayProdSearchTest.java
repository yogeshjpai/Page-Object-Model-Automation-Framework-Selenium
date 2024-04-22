package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayProdSearchTest {
  @Test
  public void Ebayprod() 
  {
	  WebDriverManager.firefoxdriver().browserVersion("124").setup();
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.ebay.com/");
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("Ramayan");
	  driver.findElement(By.id("gh-btn")).click();
	  
  }
}
