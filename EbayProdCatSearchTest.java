package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayProdCatSearchTest {
  @Test
  public void EbatCatProd() 
  {
	  WebDriverManager.firefoxdriver().browserVersion("124").setup();
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.ebay.com/");
	  
	  WebElement cat= driver.findElement(By.id("gh-cat"));
	  Select s= new Select(cat);
	  s.selectByVisibleText("Books");
	  
	  WebElement prod = driver.findElement(By.id("gh-ac"));
	  prod.sendKeys("Ramayan by ghorakpur press");
	  
	  driver.findElement(By.id("gh-btn")).click();
  }
}
