package seleniumexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class FBxl {
        public static void main(String[] args)  throws IOException {
            System.setProperty("webdriver.chrome.driver", "C:\\pooja\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(" https://facebook.com");
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                    //Prepare the path of excel file
            String filePath="C:\\Users\\EI13058\\Downloads";
            String fileName="fbxl.xls";
            String sheetName="Sheet1";
            File file = new File(filePath+"\\"+fileName);
            FileInputStream inputStream = new FileInputStream(file);
            @SuppressWarnings("resource")
            Workbook workBook = new XSSFWorkbook(inputStream);

            Sheet sheet = (Sheet) workBook.getSheet(sheetName);

                Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0);
                String a = row.getCell(0).getStringCellValue();
                String b = row.getCell(1).getStringCellValue();
                
                driver.findElement(By.xpath("//input[@name='email']")).sendKeys(a);
                driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(b);
                driver.findElement(By.xpath("//div/button[@name='login']")).click();
        }
}

