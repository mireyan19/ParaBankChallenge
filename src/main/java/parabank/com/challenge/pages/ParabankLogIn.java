package parabank.com.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParabankLogIn {

	WebDriver driver;

	public ParabankLogIn(WebDriver driver) {
		this.driver = driver;
	}

	// Localizadores de elementos

	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By logInButton = By.xpath("//input[@value='Log In']");
	private By welcomeMessage = By.xpath("//p[@class='smallText']");

	public void LogInParabank() {
		
        // Rellenar el formulario de inicio de sesión
        driver.findElement(usernameField).sendKeys(ParabankUserData.getUsername());
        driver.findElement(passwordField).sendKeys(ParabankUserData.getPassword());
        driver.findElement(logInButton).click();

	}
	 public boolean isLoginSuccessful() {
	        // Validar que el inicio de sesión fue exitoso
	        WebElement messageElement = driver.findElement(welcomeMessage);
	        return messageElement.getText().contains("Welcome");
	    }
    

}
