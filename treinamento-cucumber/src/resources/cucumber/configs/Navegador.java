package cucumber.configs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navegador {
	
	protected static WebDriver driver;

	protected void abrirNavegador() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "...");
		driver.manage().window().maximize();
	}

	public void fechar() {
		driver.quit();
	}


}
