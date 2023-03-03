package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Placeorderpage {
	WebDriver driver;
	
	
	//forDescription and place order
	By descriptionText=By.xpath("//*[@id=\"ordermsg\"]/textarea");
	By placeOrderbutton=By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");
	
	//Payment Details
	By Cardname=By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input");
	By cardNumner=By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input");
	By cvCnumber=By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input");
	By Expirationmonth=By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input");
	By ExpirationYear=By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input");
	
	
	By Paybutton=By.xpath("//*[@id=\"submit\"]");
	
	By SuccessMesg=By.xpath("//*[@id=\"form\"]/div/div/div/p");
	
	 boolean Status=false;
	//Methods
	 
	 public Placeorderpage(WebDriver driver)
		{
			this.driver = driver;
		}
	
	 
	 
	 
	public void EnterComment() {
		
		driver.findElement(descriptionText).sendKeys("ThankYou");
	}
	
	public void ClickonPlaceOrderbutton() {
		
		driver.findElement(placeOrderbutton).click();
	}
	
	public void EnterPaymentDetails() {
		
		driver.findElement(Cardname).sendKeys("Swapna");
		driver.findElement(cardNumner).sendKeys("1234 4325 4567 5436 ");
		driver.findElement(cvCnumber).sendKeys("345");
		driver.findElement(Expirationmonth).sendKeys("06");
		driver.findElement(ExpirationYear).sendKeys("2025");
		
	}
	
	public void ClickonpayandPlaceOrder() {
		driver.findElement(placeOrderbutton).click();
	}
	
	public boolean VerifySuccessmesg() {
		Status=driver.findElement(SuccessMesg).isDisplayed();
		return Status;
	}
	
	
	
	
	
}


