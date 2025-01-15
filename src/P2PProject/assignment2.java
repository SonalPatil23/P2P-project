package P2PProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://rahulshettyacademy.com/angularpractice/"); //URL in the browser
		
		driver.findElement(By.name("name")).sendKeys("sonal");
		driver.findElement(By.name("email")).sendKeys("sonal@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sonal@1234");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select abc = new Select(dropdown);

		abc.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("02/05/2024");
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		

		



}
	
}