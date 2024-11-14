package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy (xpath = "//*[@id='email']")
	public WebElement Username;

	@FindBy (xpath = "//*[@id='pass']")
	public WebElement Password;

	@FindBy (xpath = "//*[@name='login']")
	public WebElement Login;




}
