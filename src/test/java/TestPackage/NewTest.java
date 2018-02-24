package TestPackage;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver; 
  @Test
  public void f() {
	  
	  WebElement search_box = driver.findElement(By.name("q"));
	  search_box.sendKeys("porsche" + Keys.ENTER);
	  Assert.assertTrue(driver.getTitle().contains("porsche"));
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
