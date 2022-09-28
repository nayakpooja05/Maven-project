package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button")).click();
	}
	}


