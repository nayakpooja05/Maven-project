package seleniumexamples;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMForgot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
		        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		        driver.findElement(By.xpath("//button")).click();
		        String url=driver.getCurrentUrl();
		        Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","actual result and expected result");

		    }

		
	

}
