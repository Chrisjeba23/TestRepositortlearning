package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {


	private WebDriver driver;

	public Loginpage(WebDriver driver)
	{
		this.driver=driver;

	}

	private By username=By.name("username");
	private By password=By.name("password");
	private By Loginbutton=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");


	public void usernamefield()
	{
		driver.findElement(username).sendKeys("Admin");
	}

	public void passwordfield()
	{
		driver.findElement(password).sendKeys("admin");
	}

	public void Loginbutton()
	{
		driver.findElement(Loginbutton).click();
	}


}
