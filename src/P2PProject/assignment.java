package P2PProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class assignment {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//driver.findElement(By.id("checkBoxOption1")).click();
		
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		
//		
//		Assert.assertEquals(driver.findElement(By.id("checkbox-example")).getText(),"3 checkbox");
//		System.out.println(driver.findElement(By.id("checkbox-example")).getText());
		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

		driver.findElement(By.id("checkBoxOption1")).click();



		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

		driver.findElements(By.cssSelector("input[value='checkbox']")).size();

		
}
}