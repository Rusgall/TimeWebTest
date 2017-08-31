package TimeWebProj.TimeWebProj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class CenturyTariffTest extends AbstractTariffTest {

	@BeforeClass
	public static void setUpClass() {
		// Выбираем тариф и проходим регистрацию
		chooseTariffAndRegistration(TariffHosting.CENTURY);
	}

	@After
	public void tearDown() {
		webDriver.get("https://hosting.timeweb.ru/");
	}

	@AfterClass
	public static void tearDownClass() {
		webDriver.quit();
	}

	@Test
	public void testTariff() {
		Assert.assertEquals("Century+", site.getHostingMainPage().getTariff().getText());
	}

	@Test
	public void testDisk() {
		Assert.assertEquals(DISK_LABEL, site.getHostingMainPage().getTariffInfoItem(0).getText());
		Assert.assertEquals("15", site.getHostingMainPage().getTariffInfoCount(0).getText());
	}

	@Test
	public void testSite() {
		Assert.assertEquals(SITE_LABEL, site.getHostingMainPage().getTariffInfoItem(1).getText());
		Assert.assertEquals("1 из 25", site.getHostingMainPage().getTariffInfoCount(1).getText());
	}

	@Test
	public void testFTP() {
		Assert.assertEquals(USERS_FTP_LABEL, site.getHostingMainPage().getTariffInfoItem(2).getText());
		Assert.assertEquals("0 из 25", site.getHostingMainPage().getTariffInfoCount(2).getText());
	}

	@Test
	public void testSQL() {
		Assert.assertEquals(SQL_LABEL, site.getHostingMainPage().getTariffInfoItem(3).getText());
		Assert.assertEquals("0 из 25", site.getHostingMainPage().getTariffInfoCount(3).getText());
	}
}
