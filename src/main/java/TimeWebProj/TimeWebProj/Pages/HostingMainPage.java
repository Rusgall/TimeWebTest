package TimeWebProj.TimeWebProj.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HostingMainPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css = ".cpS-color-accent.cpS-lk-alt")
	WebElement tariff;
	
	@FindBy(className = "cpS-section-small-h")
	WebElement tariffSeciton;
	
	@FindBy(css = ".tariff-info-list.cpS-color-accent")
	WebElement tariffInfoList;
	
	public HostingMainPage(WebDriver driver){
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 10, 500);
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTariff(){
		return tariff;
	}
	
	public WebElement getTariffInfoItem(int i){
		return tariffInfoList.findElements(By.className("tariff-info-item")).get(i).findElement(By.className("plan-info-item-h"));
	}
	
	public WebElement getTariffInfoCount(int i){
		return tariffInfoList.findElements(By.className("tariff-info-item")).get(i).findElement(By.className("tariff-info-count-all"));
	}
	
	public WebElement getTarifSection(){
		return tariffSeciton;
	}

}
