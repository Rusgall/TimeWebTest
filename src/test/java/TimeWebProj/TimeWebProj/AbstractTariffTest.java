package TimeWebProj.TimeWebProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractTariffTest {
	
	public static final String DISK_LABEL = "Диск (SSD), ГБ:";
	public static final String SITE_LABEL = "Сайтов:";
	public static final String USERS_FTP_LABEL = "Пользователей ПУ / FTP:";
	public static final String SQL_LABEL = "Баз данных MySQL:";

	static ChromeOptions options;
	static TimeWebSite site;
	static WebDriver webDriver;

	public static void chooseTariffAndRegistration(TariffHosting tariff) {
		// Тут захардкодил путь к драйверу
		System.setProperty("webdriver.chrome.driver", "D:/Ruslan/chromedriver_win32/chromedriver.exe");

		options = new ChromeOptions();
		options.addArguments("--start-maximized");

		webDriver = new ChromeDriver(options);
		site = new TimeWebSite(webDriver);
		WebDriverWait wait = new WebDriverWait(webDriver, 5, 500);

		webDriver.get("https://timeweb.com/");

		// Переходим к выбору хостинга
		site.getMainPage().clickHosting();

		// Выбираем тариф
		site.getServiceHostingPage().chooseTarif(tariff.ordinal());

		// Ввводим имеил и имя
		site.getServiceHostingPage().enterMail("SorryButTestMail@mail.ru");

		site.getServiceHostingPage().enterName("Тест Тест Тест");

		// Подтверждаем правила и делаем заказ
		site.getServiceHostingPage().AgreeTerms();

		site.getServiceHostingPage().toOrder();

		// Ждем пока страничка прогрузться
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cpS-color-accent.cpS-lk-alt")));
	}

}
