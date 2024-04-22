package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.Fieldsearch;
import pomPages.OpenBrowser;

public class POMEbayCatProdSearch {
  @Test
  public void POMEbayCatProd() 
  {
WebDriver driver = OpenBrowser.StartBrowser("Firefox", "https://www.ebay.com/"); 
	  
	  Fieldsearch cat= new Fieldsearch(driver);
	  cat.catsearch("Books", "The Sita");
	  
	  Reporter.log("Ebay search test is successful");
  }
}
