import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sets the driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/lakkh/OneDrive/Documents/chromedriver.exe");
        
		//Opens a new browser
		WebDriver driver = new ChromeDriver();
		
		// Sibling - Child to Parent traverse
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath(""));
	}

}
