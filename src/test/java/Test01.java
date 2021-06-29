import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {
	
	
	
	@Test
	 public void readExcel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException  {
		    
			// }
				    
				  //  public static void main(String...strings) throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException{

				    	String xlpath ="D:/Demo/Demofile.xlsx" ;
				    	
				    	 //Create an object of File class to open xlsx file
					    File file = new File(xlpath);
					    
					    //Create an object of FileInputStream class to read excel file
					    FileInputStream inputStream = new FileInputStream(file);				    
					    
					    Workbook wb = WorkbookFactory.create(inputStream);				    
					   				    
					    Sheet s1 = wb.getSheet("sheet1");
					    				    
					    Row r = s1.getRow(4) ;
					    Cell c =r.getCell(2);
					    String username = c.getStringCellValue();
					   // System.out.println(v);
					    Row r1 = s1.getRow(4) ;
					    Cell c1 =r1.getCell(3);
					    String password = c1.getStringCellValue();
					    
					    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						
						Thread.sleep(2000);		
				//		driver.get("http://demo.guru99.com/test/newtours/");
				//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
						driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
				         

			}

}
