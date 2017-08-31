package TimeWebProj.TimeWebProj.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceHostingPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css = "a[href='/ru/services/hosting/']")
	WebElement hosting;
	
	@FindBy(id = "hosting-table")
	WebElement tariffTable;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[14]/form/div[2]/div[1]/div[2]/div[2]/input")
	WebElement inputName;
	
	@FindBy(name = "email")
	WebElement inputMail;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[14]/form/div[2]/div[2]/div[2]/div[1]/label")
	WebElement agreeTerms;
	
	@FindBy(css = ".btn.flr.ph35.mt-5")
	WebElement btnOrder;
	
	public ServiceHostingPage(WebDriver driver){
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 10, 500);
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickHosting(){
		hosting.click();
	}
	
	
	public void chooseTarif(int i){
		tariffTable.findElements(By.tagName("tr")).get(4).findElements(By.tagName("td")).get(i).findElement(By.className("btn")).click();
	}
	
	public void enterName(String name){
		inputName.sendKeys(name);
	}
	
	public void enterMail(String mail){
		inputMail.clear();
		inputMail.sendKeys(mail);
	}
	
	public void AgreeTerms(){
		agreeTerms.click();
	}
	
	public void toOrder(){
		btnOrder.click();
	}
	
	public WebElement getName(){
		return inputName;
	}
}
