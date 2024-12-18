import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome
		//System.setProperty("webdriver.chrome.driver", "C:/Users/lakkh/OneDrive/Documents/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Edge
		System.setProperty("webdriver.edge.driver", "C:/Users/lakkh/OneDrive/Documents/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
