package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLeave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.name("username")).sendKeys("Admin");
	
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
	
		 driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		  driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
	         driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
	         driver.findElement(By.xpath("//button[@type='submit']")).click();    
	}
}

