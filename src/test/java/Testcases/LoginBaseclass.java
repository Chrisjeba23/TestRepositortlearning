package Testcases;

import org.testng.annotations.Test;

import Pages.Loginpage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginBaseclass {

	public WebDriver driver;
	public Loginpage lpa;




	
	@BeforeMethod
	public void beforeMethod() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lpa=new Loginpage(driver);

	}

	@AfterMethod
	public void afterMethod() {
		
		driver.close();
	}

}
