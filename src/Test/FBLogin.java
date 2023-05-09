package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sujatha723@yahoo.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234567");

		WebElement Loginbtn = driver.findElement(By.name("login"));
		Loginbtn.click();

	}

}
