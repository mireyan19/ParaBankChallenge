package parabank.com.challenge.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import parabank.com.challenge.pages.ParabankLogIn;
import parabank.com.challenge.pages.ParabankRegisterPage;
import parabank.com.challenge.pages.PrincipalParabankPage;

public class ParabankRegisterTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();

		PrincipalParabankPage ppage = new PrincipalParabankPage(driver);
		ppage.GoToRegister();
		ParabankRegisterPage rpage = new ParabankRegisterPage(driver);
		rpage.DoRegister();
		ParabankLogIn plogin = new ParabankLogIn(driver);
		plogin.LogInParabank();

		// Verificar que el inicio de sesión fue exitoso
		if (plogin.isLoginSuccessful()) {
			System.out.println("Login successful.");
		} else {
			System.out.println("Login failed.");
		}

		// Indicación: Cerrar el navegador
		driver.quit();

	}

}
