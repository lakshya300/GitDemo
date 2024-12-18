import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import dev.failsafe.internal.util.Assert;
public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Sets the driver
				System.setProperty("webdriver.chrome.driver", "C:/Users/lakkh/OneDrive/Documents/chromedriver.exe");
		        
				//Opens a new browser
				WebDriver driver = new ChromeDriver();
		        
				//implicit wait time out
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        
		        //Get the Password
		        String password = getPassword(driver);
				
		        //Opens the specific URL in the browser
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
		        
				//Sign In
				String name = "lakshya";
				driver.findElement(By.id("inputUsername")).sendKeys(name);
		        driver.findElement(By.name("inputPassword")).sendKeys(password);
		        driver.findElement(By.className("signInBtn")).click();
		        Thread.sleep(1000);
		        
		        //Assert the login message
		        System.out.println(driver.findElement(By.tagName("p")).getText());
		        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " + name + ",");
		        
		        //Logout
		        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		        driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}
	
}
