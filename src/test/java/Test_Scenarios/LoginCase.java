  package Test_Scenarios;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import Objects.LoginPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pageObject.LoginPage;

public class LoginCase 
{
	public static WebDriver driver;
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
        
		
		 //System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe"); 
	     //driver = new FirefoxDriver(); 
		
		// driver.get("https://admin-demo.nopcommerce.com/login?");   //https://admin-demo.nopcommerce.com/login?  //https://demoqa.com/login
    	//  System.out.println("url is call");
     	// Thread.sleep(5000);
    	
    	     }

	
    @Test(priority=1)
    public void test1() throws InterruptedException { 
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
          
          String expectedUrl = "https://admin-demo.nopcommerce.com/admin/";
          String actualUrl = driver.getCurrentUrl();
          Assert.assertEquals(actualUrl, expectedUrl, "Valid login .");
          Thread.sleep(12000);
          
         
          
        //driver.findElement(By.xpath( "//input[@id='Email']")).sendKeys("admin123@test");;
    }
    
  
  //case 2 valid email +Invalid password 
   @Test (priority=2)      
   public void test2() throws InterruptedException 
   { 
	   lp=new LoginPage(driver);
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	   driver.get("https://admin-demo.nopcommerce.com/login?");
   	    System.out.println("url is call");
   	     Thread.sleep(5000);
   	     
	   
   	    lp.setUserName("admin@yourstore.com");        
         System.out.println("User is Enter");
          Thread.sleep(3000);
        
   	    lp.setPassword("admi");        
         System.out.println("password  is Enter");
       
        lp.clickLogin();
         //Thread.sleep(3000);
         
         String expectedErrorMessage = "The credentials provided are incorrect";
         WebElement errorMessage = driver.findElement(By.xpath("//li[normalize-space()='The credentials provided are incorrect']"));
         String actualErrorMessage = errorMessage.getText();
         Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Invalid Password test failed."); 
         
         Thread.sleep(8000);
         
    }
   
   
  
 //case 3=> Invalid email +valid password
   @Test  (priority=3)
   public void test3() throws InterruptedException 
   { 
	   lp=new LoginPage(driver);
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	   driver.get("https://admin-demo.nopcommerce.com/login?");
  	    System.out.println("url is call");
  	     Thread.sleep(5000);
	  
   	lp.setUserName("admi@yourstore.com");        
         System.out.println("User is Enter");
          Thread.sleep(3000);
        
   	 lp.setPassword("admin");        
         System.out.println("password  is Enter");
       
        lp.clickLogin();
         Thread.sleep(3000);
         
         String expectedErrorMessage = "No customer account found";
         WebElement errorMessage = driver.findElement(By.xpath("//li[normalize-space()='No customer account found']"));
         String actualErrorMessage = errorMessage.getText();
         Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Invalid username test failed."); 
         Thread.sleep(8000);
         
 }
   
  //case 4 to check the title 
   @Test(priority=4)
   public void test4() throws InterruptedException { 
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
         
         String title  = "Dashboard / nopCommerce administration";
         String actualTitle  = driver.getTitle();
         Assert.assertEquals(title, actualTitle, "Valid Title  .");
         System.out.println("");
         Thread.sleep(12000);
         
        
         
       //driver.findElement(By.xpath( "//input[@id='Email']")).sendKeys("admin123@test");;
   }
   
   
 //case 4 to check the title 
   @Test(priority=5)
   public void test5() throws InterruptedException { 
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
         
         
       
         
         
       
    
   }
   
   
   
/*
   @AfterTest
   public void tearDown()
   {
   	driver.quit();
   	System.out.println("window closed");
   }
  */
   
}

   
   
   
   
   
   
   
   
   
   
   
   
   /*
 //case 4=> Invalid email +Invalid password
   @Test  (priority=4)
   public void test4() throws InterruptedException 
   { 
	   driver.get("https://admin-demo.nopcommerce.com/login?");
 	    System.out.println("url is call");
 	     Thread.sleep(5000);
	     
   	lp.setUserName("admi@yourstore.com");         
         System.out.println("User is Enter");
          Thread.sleep(3000);
        
   	 lp.setPassword("admi");        
         System.out.println("password  is Enter");
       
        lp.clickLogin();
         Thread.sleep(5000);
         
         String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\r\n" + 
         		"No customer account found";
         WebElement errorMessage = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]"));
         String actualErrorMessage = errorMessage.getText();
         Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Invalid username test failed."); //Invalid username & Password  test Pass.
        
    }
    
    */
   
 














/*

//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
/*
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://admin-demo.nopcommerce.com/");
  	 Thread.sleep(2000);
  	 
  	 
  	 
	    ///	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		 //  driver= new ChromeDriver();
		///*
		ChromeOptions option = new ChromeOptions();
      option.addArguments("--remote-allow-origins=*");
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver(option);
      
*/