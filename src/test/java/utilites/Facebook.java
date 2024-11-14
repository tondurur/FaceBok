package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class Facebook {

	public Properties prop;
	public WebDriver driver;

	public void FaceBookLogin() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\tondu\\eclipse-workspace\\ravi\\Facebook_Framework\\src\\test\\java\\propertyfiles");
		prop.load(fis);

		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		LoginPage lpg = PageFactory.initElements(driver, LoginPage.class);
		lpg.Username.sendKeys("9652882816");
		lpg.Password.sendKeys("Ravi@123");
		lpg.Login.click();


	}

}
