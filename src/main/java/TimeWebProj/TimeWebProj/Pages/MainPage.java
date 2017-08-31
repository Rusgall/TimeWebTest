package TimeWebProj.TimeWebProj.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css = "a[href='/ru/services/hosting/']")
	WebElement hosting;
	
	public MainPage(WebDriver driver){
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 10, 500);
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickHosting(){
		hosting.click();
	}
}
