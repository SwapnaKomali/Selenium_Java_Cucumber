package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ViewCategorypage {
	WebDriver driver;
	By categoryText=By.xpath("//div[@class=\"left-sidebar\"]/h2");
	
	By Womenbutton=By.xpath("//a[@href=\"#Women\"]");
	
	By Topbutton=By.xpath("//a[@href=\"/category_products/2\"]");
	
	By WomenTextField=By.xpath("//div[@class=\"features_items\"]/h2");
	
	By mentext=By.xpath("//a[@href=\"#Men\"]");
	
	By tshirtbutton=By.xpath("//a[@href=\"/category_products/3\"]");
	
	By menTextField=By.xpath("//h2[@class=\"title text-center\"]");
	
Boolean Status=false;
	
	public ViewCategorypage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyCategoryField() {
	String value=driver.findElement(categoryText).getText();
		return value;
	}
	
	public void clickonwomenButton() {
		driver.findElement(Womenbutton).click();
	}
	
	public void ClickOnTopbutton() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
 	    js.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(Topbutton).click();
	}
	
	
	public Boolean VerifyTextField() {
		Status=driver.findElement(WomenTextField).isDisplayed();
		return Status;
	}
	
	public void ClickOnmenButton() {
		driver.findElement(mentext).click();
	}
	
	public void clickonTshirt() {
		driver.findElement(tshirtbutton).click();
	}
	
	public Boolean VerifyMenTextfield() {
		Status=driver.findElement(menTextField).isDisplayed();
		return Status;
				
	}
	
	
	
}
