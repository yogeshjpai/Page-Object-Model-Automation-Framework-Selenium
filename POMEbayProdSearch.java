package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.Fieldsearch;
import pomPages.OpenBrowser;

public class POMEbayProdSearch extends OpenBrowser
{
  @Test
  public void POMEbayProd() 
  {
	  WebDriver driver = OpenBrowser.StartBrowser("Firefox", "https://www.ebay.com/"); 
	  
	  Fieldsearch prod= new Fieldsearch(driver);
	  prod.prodsearch("Amish");
	  
  }
}
