package P2PProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class directTrading {

	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments ("--remote-allow-origins=*");
//		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");	
//		WebDriver driver = new ChromeDriver(options);
		
		System.setProperty("webdriver.edge.driver", "D:\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
		
		driver.get("https://p2p-web.electreecity.in/auth/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		WebElement MobNumber = wait.until(ExpectedConditions.elementToBeClickable(By.id("phone")));  //sendKeys("9765612823");
		 MobNumber.sendKeys("9765612823");
		 
		 
		 WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
	    	 pass.sendKeys("Test@1234");
	    	 
		 WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		 login.click();
		
//		 WebElement otp = wait.until(ExpectedConditions.elementToBeClickable(By.id("otpLogin")));
//	    	 otp.sendKeys("123456");
		
		
	
	
	
	}

}