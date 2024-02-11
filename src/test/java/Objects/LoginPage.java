package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver driver; 
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	
	   @FindBy(xpath = "//input[@id='Email']")  //[input[@id='Email']       //input[@id='userName']
	   @CacheLookup
	     WebElement userName;
	
	
	   @FindBy(xpath = "//input[@id='Password']")                            ////input[@id='password']
	   @CacheLookup
	   WebElement  password;
	   
	   @FindBy(xpath="//button[@type='submit']")          ////button[@id='login']
	   @CacheLookup
	   WebElement btnLogin;
	   
	   @FindBy(linkText="Logout")    //xpath="//a[normalize-space()='Logout']"
	   @CacheLookup
	    WebElement lnkLogout;
	   
	    public  void setUserName(String user)
	     {
	    	userName.clear();
	    	userName.sendKeys(user);
		 }
	     
	    public  void setPassword(String pwd)
	    {
	    	password.clear();
	    	password.sendKeys(pwd);
	    }
	 
	    public  void clickLogin()
	    {
	    	btnLogin.click();
	    }
	 
	    public void clickLogout()
	    {
	    	lnkLogout.click();
	    }
	    
	    
	    

}
