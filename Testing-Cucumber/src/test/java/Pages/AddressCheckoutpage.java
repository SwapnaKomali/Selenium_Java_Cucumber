package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.backend.Status;

public class AddressCheckoutpage {

	WebDriver driver;
	//Locaters for signup
	By signupName=By.xpath("//input[@name=\"name\"]");
	
	By MailId=By.xpath("(//input[@name=\"email\"])[2]");
	
	By signupButton=By.xpath("(//button[@type=\"submit\"])[2]");
	
	By pwd=By.xpath("//input[@id=\"password\"]");
	
	By firstName=By.xpath("//input[@id=\"first_name\"]");
	
	By lastName=By.xpath("//input[@id=\"last_name\"]");
	
	By Address1=By.xpath("//input[@id=\"address1\"]");
	
	By country=By.xpath("//*[@id=\"country\"]");
	
	By state=By.xpath("//input[@id=\"state\"]");
	
	By City=By.xpath("//input[@id=\"city\"]");
	
	By Zipcode=By.xpath("//input[@id=\"zipcode\"]");
	
   By mobileNumber=By.xpath("//input[@id=\"mobile_number\"]");
   
   By CreateAcnt=By.xpath("(//button[@class=\"btn btn-default\"])[1]");
   
   
   //VeriftAccount Created
   
   By AcuntTextField=By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
   
   By Continuebutton=By.xpath("//a[@class=\"btn btn-primary\"]");
   
   By LoginnameText=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
   
   //AfterviewCary
   By proceed =By.xpath("//a[@class=\"btn btn-default check_out\"]");
   
   By VerifyDeliveryAddress=By.xpath("//*[@id=\"address_delivery\"]/li[7]");
   
   By VerifyBllingAdrs=By.xpath("//*[@id=\"address_invoice\"]/li[7]");
   
   //Delete Account
   By deleteAcunt=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
   By AcountDeletedText=By.xpath("//*[@id=\"form\"]/div/div/div/h2");
   By lastContinuebutton=By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
   
   boolean Status=false;
   //methods
   public AddressCheckoutpage(WebDriver driver)
	{
		this.driver = driver;
	}
   
   public void CreateAccount() {
	   driver.findElement(signupName).sendKeys("swapna");
	   driver.findElement(MailId).sendKeys("swapna@gmail.com");
	   driver.findElement(signupButton).click();
	   driver.findElement(pwd).sendKeys("desff123");
	   driver.findElement(firstName).sendKeys("Swapna");
	   driver.findElement(lastName).sendKeys("Komali");
	   driver.findElement(Address1).sendKeys("Reddypalli,Peddapappuru,515445");
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,600)", "");
	    
	   //driver.findElement(country).sendKeys("India");
	    Select Country=new Select(driver.findElement(country));
	    Country.selectByVisibleText("India");
	   driver.findElement(state).sendKeys("Andrapradesh");
	   driver.findElement(City).sendKeys("Anantapur");
	   driver.findElement(Zipcode).sendKeys("515445");
	   driver.findElement(mobileNumber).sendKeys("9346683303");
	   driver.findElement(CreateAcnt).click();
   }
   
   public boolean VeriftAcuntTextField() {
	   Status=driver.findElement(AcuntTextField).isDisplayed();
	   return Status;
   }
	   
   public void ClickContinuebutton() {
	   
	   driver.findElement(Continuebutton).click();
   }
   
   public  boolean VerifyLoginNameText() {
	   Status=driver.findElement(LoginnameText).isDisplayed();
	   return Status;
   }
   
   public void ClickonProceedtoCheckout() {
	   driver.findElement(proceed).click();
   }
   
   public boolean VerifyDeliveryAddress() {
	   Status=driver.findElement(VerifyDeliveryAddress).isDisplayed();
	   return Status;
   }
   
   public boolean verifyBillingAddress() {
	   Status=driver.findElement(VerifyBllingAdrs).isDisplayed();
	   return Status;
   }
   public void ClickdeleteAccount() {
	   driver.findElement(deleteAcunt).click();
   }
   
   public boolean VerifydeletedText() {
	   Status=driver.findElement(AcountDeletedText).isDisplayed();
	   return Status;
	   
   }
   public void ClickonfinalcontinueButton() {
	   driver.findElement(lastContinuebutton).click();
   }
   
	   
	   
	   
   
}