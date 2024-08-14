package parabank.com.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PrincipalParabankPage {

	WebDriver driver;
	
	public PrincipalParabankPage (WebDriver driver) {
		this.driver=driver;
	}

	public void GoToRegister() {

		driver.findElement(By.linkText("Register")).click();

	}

}
