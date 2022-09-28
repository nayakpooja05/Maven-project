package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		        System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/reg/");
				Thread.sleep(1000);
				driver.findElement(By.name("firstname")).sendKeys("Pooja");
				Thread.sleep(1000);
				driver.findElement(By.name("lastname")).sendKeys("nayak");
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
				//driver.findElement(By.tagName("label")).click();
				driver.findElement(By.className("_8esa")).click();
				//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
			//	driver.findElement(By.id("u_3_4_eN")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("websubmit")).click();
				Thread.sleep(1000);
				
				
	}

		}
	


