package testngexmpl;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;



public class AllAssignment {
    
  @Test
  public void Hrm() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
        Thread.sleep(1000);
        
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//div[2]/input")).click();
            driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ranjitha");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            
            driver.findElement(By.linkText("Leave")).click();
              driver.findElement(By.linkText("Apply")).click();
            driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
            driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
            driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
            driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
            driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li//span[@class='oxd-userdropdown-tab']")).click();
            Thread.sleep(1000);
            driver.findElement(By.linkText("Logout")).click();
            
                
            
  }
  @Test
  public void facebookfsignup() throws InterruptedException
  
  {
      Thread.sleep(1000);
      System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sachin");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M B");
        
        
        driver.findElement(By.name("reg_email__")).sendKeys("pooja2000@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pooja2000@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("poo@12");
        driver.findElement(By.id("day")).sendKeys("21");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
        
        
  }
  @Test
  public void webtable()
  
  {
      System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp ");
        String Company=driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
        System.out.println("Company : "+Company);
        String contact=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
        System.out.println("Contact : "+contact);
        String country=driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
        System.out.println("Country : "+country);
         
  }
  @Test
  public void mouseover() throws InterruptedException
  {
      System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.aptransport.org/");
        Actions mouse= new Actions(driver);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        mouse.moveToElement(driver.findElement(By.linkText("REGISTRATION"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Trade Certificate")).click();
        
  }
  

  



}