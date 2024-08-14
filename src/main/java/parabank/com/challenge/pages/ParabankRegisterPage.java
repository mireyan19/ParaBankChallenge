package parabank.com.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.UUID;

public class ParabankRegisterPage {

	WebDriver driver;

	public ParabankRegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	// Localizadores de elementos

	private By firstNameField = By.name("customer.firstName");
	private By lastNameField = By.name("customer.lastName");
	private By addressField = By.name("customer.address.street");
	private By cityField = By.name("customer.address.city");
	private By stateField = By.name("customer.address.state");
	private By zipCodeField = By.name("customer.address.zipCode");
	private By phoneNumberField = By.name("customer.phoneNumber");
	private By ssnField = By.name("customer.ssn");
	private By usernameField = By.name("customer.username");
	private By passwordField = By.name("customer.password");
	private By confirmPasswordField = By.name("repeatedPassword");
	private By registerButton = By.xpath("//input[@value='Register']");
	private By OutButton = By.xpath("//a[normalize-space()='Log Out']");

	public void DoRegister() {
		// Generar datos aleatorios
		String username = randomString();
		String password = randomString();

		// Establecer datos en ParabankUserData
		ParabankUserData.setUsername(username);
		ParabankUserData.setPassword(password);

		// Rellenar el formulario de registro
		driver.findElement(firstNameField).sendKeys(randomString());
		driver.findElement(lastNameField).sendKeys(randomString());
		driver.findElement(addressField).sendKeys(randomString());
		driver.findElement(cityField).sendKeys(randomString());
		driver.findElement(stateField).sendKeys(randomString());
		driver.findElement(zipCodeField).sendKeys(randomNumber(5));
		driver.findElement(phoneNumberField).sendKeys(randomNumber(10));
		driver.findElement(ssnField).sendKeys(randomNumber(9));
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(confirmPasswordField).sendKeys(password);

		// Hacer clic en el botón de registro
		driver.findElement(registerButton).click();

		// Validar el mensaje de éxito
		WebElement successMessage = driver.findElement(By.xpath("//h1[@class='title']"));
		if (successMessage.getText().contains("Welcome " + username)) {
			System.out.println("Account created successfully.");
		} else {
			System.out.println("Account creation failed.");
			return;
		}

		// Hacer clic en el botón de salida
		driver.findElement(OutButton).click();

	}

	private String randomString() {
		return UUID.randomUUID().toString().substring(0, 8);
	}

	private String randomNumber(int length) {
		StringBuilder number = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			number.append(random.nextInt(10));
		}
		return number.toString();
	}

}
