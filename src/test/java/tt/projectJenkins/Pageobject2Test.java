package tt.projectJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import tt.projectJenkins.PageObjects;

public class Pageobject2Test {
  @Test
  public void searchTest1() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  PageObjects po =new PageObjects(driver);
	  po.search().sendKeys("tomato");
	  po.searchButton().click();
  }
}
