package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() throws InterruptedException  {
			
			for(int i=0;i<=10;i++) {
			
			
			driver.get("https://www.google.com/"); 
			
			//Thread.sleep(10000);
			String title = driver.getTitle();				 
			//Assert.assertTrue(title.contains("Demo Guru99 Page")); 
			System.out.println("title"+title);
			Assert.assertTrue(title.contains("Google"));
			
			
			System.out.println("Pass");
			
		//	WebElement element = driver.findElement(By.xpath("//span[text()='Sign in']"));
			
			//String value  = element.getCssValue("color");
			
			//String value1 = value.get
			//String[] arrColo
			//value.split("#");

			//		getCssValue("color");
			//ystem.out.println(value);
			
			}	
		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

			System.setProperty("java.awt.headless", "false"); 
			// Initialize browser
			 driver=new ChromeDriver();
		    //driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}