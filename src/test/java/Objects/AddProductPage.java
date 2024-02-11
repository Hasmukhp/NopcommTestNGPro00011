package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage 
{
WebDriver driver; 
	
	public AddProductPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	
	   @FindBy(xpath = "//input[@id='Name']")   
	   @CacheLookup
	     WebElement productName ;
	   
	   @FindBy(xpath = "//textarea[@id='ShortDescription']")   
	   @CacheLookup
	     WebElement shortDescription ;
	   
	   
	   @FindBy(xpath = "//*[@id=\"FullDescription_ifr\"]")   
	   @CacheLookup
	     WebElement fullDescription ;
	   
	   @FindBy(xpath = "//input[@id='Sku']")   
	   @CacheLookup
	     WebElement  sku;
	   
	   @FindBy(xpath = "//li[normalize-space()='Computers']")   
	   @CacheLookup
	     WebElement  categories ;
	   
	   @FindBy(xpath = "//li[normalize-space()='Apple']")   
	   @CacheLookup
	     WebElement manufacturers ;
	   
	   @FindBy(xpath = "//div[@id='ui-id-30']")   
	   @CacheLookup
	     WebElement productTags ;
	   
	   @FindBy(xpath = "//input[@id='Gtin']")   
	   @CacheLookup
	     WebElement globalTradeTtemNumber ;
	   
	   @FindBy(xpath = "//input[@id='ManufacturerPartNumber']")   
	   @CacheLookup
	     WebElement ManufacturerPartNumber ;
	   
	   
	   @FindBy(xpath = "//select[@id='ProductTypeId']")   
	   @CacheLookup
	     WebElement ProductType ;
	   
	   @FindBy(xpath = "//select[@id='VendorId']")   
	   @CacheLookup
	     WebElement Vendor ;
	   
	   

	   @FindBy(xpath = "//textarea[@id='AdminComment']")   
	   @CacheLookup
	     WebElement adminComment ;
	   
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
