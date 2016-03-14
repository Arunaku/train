package tt.projectJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	WebDriver driver;
	
	public PageObjects(WebDriver driver){
		this.driver = driver;
	}
	
	By search = By.id("lst-ib");
	By searchbutton = By.name("btnG");
	
	public WebElement search(){
		return driver.findElement(search);
	}

	public WebElement searchButton(){
		return driver.findElement(searchbutton);
	}
}
