import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//Sets the driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/lakkh/OneDrive/Documents/chromedriver.exe");
        
		//Opens a new browser
		WebDriver driver = new ChromeDriver();
        
		//implicit wait time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
		//Opens the specific URL in the browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        
		//Different Locator Actions
		driver.findElement(By.id("inputUsername")).sendKeys("lakshya");
        driver.findElement(By.name("inputPassword")).sendKeys("sfdc");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Lakshya");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("lakkhu");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("lakkhu");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("2342344424");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("lakshya18");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        
	}

}
