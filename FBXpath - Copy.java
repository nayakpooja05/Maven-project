package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/reg/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Pooja");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("nayak");
			Thread.sleep(1000);
			driver.findElement(By.name("reg_email__")).sendKeys("nayakpooja203@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nayakpooja203@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.name("reg_passwd__")).sendKeys("nayakpooja05");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("5");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Jun");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2000");
			Thread.sleep(1000);
			driver.findElement(By.className("_8esa")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("websubmit")).click();
			Thread.sleep(1000);
	}

}
