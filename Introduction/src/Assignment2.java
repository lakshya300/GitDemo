import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Declaration of web driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/lakkh/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Opens the specific URL in the browser
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Details
		String Name = "Lakshya Agrawal";
		String Email = "lakkhu18@gmail.com";
		String Password = "Password";

		// Fill the form details Name Email Password
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);

		// Select and Verify checkbox
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='exampleCheck1']")).isSelected(),
				"The Icecream checkbox is not selected");

		// Select Gender from dropdown
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Male");

		// Select the Radio Button
		driver.findElement(By.xpath("//input[@type='radio'][@value='option2']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@type='radio'][@value='option3']")).isEnabled(),
				"Enterpreneur radio is not disabled");

		// Send Date value in calender
		driver.findElement(By.xpath("//input[contains(@type,'date')]")).sendKeys("18071998");

		// Click Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Assert and print the success message
		Assert.assertTrue(driver.findElement(By.cssSelector(".alert")).isDisplayed(), Password);
		System.out.println(driver.findElement(By.cssSelector(".alert")).getText());
	}

}
