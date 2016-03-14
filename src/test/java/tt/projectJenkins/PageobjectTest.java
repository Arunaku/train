package tt.projectJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import tt.projectJenkins.PageObjects;

public class PageobjectTest {
  @Test
  public void searchTest() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  PageObjects po =new PageObjects(driver);
	  po.search().sendKeys("selenium");
	  po.searchButton().click();
  }
}
