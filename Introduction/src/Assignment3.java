import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaration of web driver
				System.setProperty("webdriver.chrome.driver", "C:/Users/lakkh/OneDrive/Documents/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
				driver.manage().window().maximize();

				// Opens the specific URL in the browser
				driver.get("https://rahulshettyacademy.com/loginpagePractise/");

				//Pick the username and password
			    String UserName = driver.findElements(By.cssSelector("p.text-center.text-white>b")).getFirst().getText();
				String Password = driver.findElements(By.cssSelector("p.text-center.text-white>b")).getLast().getText();
				
				//Fill the details
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
				driver.findElement(By.xpath("//input[@value='user']/following-sibling :: span"));
				
				//Wait for Okey button to appear using explicit wait
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
				driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
				
				//Dropdown with select tag
				WebElement staticDropdown = driver.findElement(By.xpath("//select[@data-style=\"btn-info\"]"));
				Select dropdown =new Select(staticDropdown);
				
				dropdown.selectByValue("consult");
				
				
				
				
				
	}

}
