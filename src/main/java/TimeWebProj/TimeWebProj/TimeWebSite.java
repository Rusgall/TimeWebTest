package TimeWebProj.TimeWebProj;

import org.openqa.selenium.WebDriver;

import TimeWebProj.TimeWebProj.Pages.HostingMainPage;
import TimeWebProj.TimeWebProj.Pages.MainPage;
import TimeWebProj.TimeWebProj.Pages.ServiceHostingPage;

public class TimeWebSite {
	WebDriver driver;
	
	HostingMainPage hostingMainPage;
	MainPage mainPage;
	ServiceHostingPage serviceHostingPage;
	
	public TimeWebSite(WebDriver driver){
		this.driver = driver;
	}
	
	public HostingMainPage getHostingMainPage(){
		if(hostingMainPage == null)
			hostingMainPage = new HostingMainPage(driver);
		return hostingMainPage;
	}
	
	public MainPage getMainPage(){
		if(mainPage == null)
			mainPage = new MainPage(driver);
		return mainPage;
	}
	
	public ServiceHostingPage getServiceHostingPage(){
		if(serviceHostingPage == null)
			serviceHostingPage = new ServiceHostingPage(driver);
		return serviceHostingPage;
	}
}
