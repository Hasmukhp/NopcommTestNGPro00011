package Test_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.AddProductPage;
import Objects.LoginPage;

public class AddProductC001 
{
	public static WebDriver driver;
    public AddProductPage aPP;
    public LoginPage lp;
  
    
	@BeforeTest
    public void beforeTest() throws InterruptedException 
    {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//driver =new ChromeDriver();
		// Set Chrome options to open a new tab for each test case
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--new-tab");

        // Create a new instance of ChromeDriver with the options
        driver = new ChromeDriver(options);
    }
        
        @Test(priority=1)
        public void AddProductC001() throws InterruptedException { 
        	 lp=new LoginPage(driver);
     		driver.manage().window().maximize();
     		 driver.manage().deleteAllCookies();
        	driver.get("https://admin-demo.nopcommerce.com/login?");
        	System.out.println("url is call");
        	 Thread.sleep(5000);
        	 
        	
        	lp.setUserName("admin@yourstore.com");        
              System.out.println("User is Enter");
               Thread.sleep(3000);
             
        	 lp.setPassword("admin");        
              System.out.println("password  is Enter");
            
             lp.clickLogin();
              Thread.sleep(3000);
              
              driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
              Thread.sleep(3000);
              driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
              Thread.sleep(3000);
              driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
              Thread.sleep(3000);
              
              
            driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Handle_001");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//textarea[@id='ShortDescription']")).sendKeys("Handle use in several place like Main door, inside handle etc..");
            Thread.sleep(1000);
          //  driver.findElement(By.xpath("//*[@id=\\\"FullDescription_ifr\\\"]")).sendKeys("Handle use in several place like Main door, inside handle /n test 0001add product");
           // Thread.sleep(1000);
            
            
            driver.findElement(By.xpath("//input[@id='Sku']")).sendKeys("Stock005300A1");
            Thread.sleep(1000);
            
          //  driver.findElement(By.xpath("//li[normalize-space()='Computers']")).sendKeys("computers");
          //  Thread.sleep(1000);
            
           // driver.findElement(By.xpath("//li[normalize-space()='Apple']")).sendKeys("Apple");
           // Thread.sleep(1000);
            
        //    driver.findElement(By.xpath("//div[@class='tag-editor-tag']")).sendKeys("camera");
         //   Thread.sleep(1000);
            
            driver.findElement(By.xpath("//input[@id='Gtin']")).sendKeys("G0003283BT03X223456");
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//input[@id='ManufacturerPartNumber']")).sendKeys("M0000KAX98234");
            Thread.sleep(1000);
            
           // driver.findElement(By.xpath("//select[@id='ProductTypeId']")).sendKeys("");
           // Thread.sleep(1000);
     	   
           
            
            driver.findElement(By.xpath("//textarea[@id='AdminComment']")).sendKeys("This is new product lunch in less price ");
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//button[@name='save']")).click();
            Thread.sleep(8000);
        
	}
        
        
        
        
        
        
        
        
        
        
        
        @AfterTest
        public void tearDown()
        {
        	driver.quit();
        	System.out.println("window closed");
        }
          
        
        
        
	
}
