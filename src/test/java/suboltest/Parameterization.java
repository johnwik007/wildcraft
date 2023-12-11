package suboltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Parameters("url")
@Test
public class Parameterization 
{
	public void verifyUserLoginWithValidCredentials(String URL) {
		
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get(URL);
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("subolkumar721@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}
	
	
	
	

}
