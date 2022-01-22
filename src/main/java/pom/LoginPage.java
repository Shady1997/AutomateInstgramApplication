package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	public WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'Log In')]")
	public WebElement loginButton;
	
	@FindBy(xpath = "//button[normalize-space()='Save Info']")
	public WebElement saveInfoButton;
	
	@FindBy(xpath = "//button[contains(@class,'HoLwm')]")
	public WebElement notNowButton;

}
