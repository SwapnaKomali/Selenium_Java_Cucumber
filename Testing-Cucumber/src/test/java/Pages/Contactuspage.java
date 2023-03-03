package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contactuspage {
        WebDriver driver;
        
	By HomepageText=By.xpath("(//a[@href=\"/\"])[1]");
	
	By ContactButton=By.xpath("//a[@href=\"/contact_us\"]");
	
	By VerifyText=By.xpath("(//h2[@class=\"title text-center\"])[1]");
	
	By nameTextField=By.xpath("(//input[@type=\"text\"])[1]");
	
	By mailIdTextField=By.xpath("(//input[@type=\"email\"])[1]");
	
	By SubjectTextField=By.xpath("//input[@data-qa=\"subject\"]");
	
	By messageField=By.xpath("//textarea[@name=\"message\"]");
	
	By UploadFile=By.xpath("//input[@name=\"upload_file\"]");
	
	By Submitbutton=By.xpath("//input[@type=\"submit\"]");
	
	By SuccessMessage=By.xpath("//div[@class=\"status alert alert-success\"]");
	
	By HomeButton=By.xpath("//*[@id=\"form-section\"]/a/span");
	
	Boolean status= false;
	
	public Contactuspage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public Boolean  HomebuttonisPresent() {
		status = driver.findElement(HomepageText).isDisplayed();
		return status;
	}
	
	public void clickonContactbutton() {
		driver.findElement(ContactButton).click();
		
	}
	
	public Boolean VerifyGetinTouchText() {
		Boolean msg=driver.findElement(VerifyText).isDisplayed();
		return msg;
	}
	
	public void enterContactDetails(String Name,String Email,String Subject,String Message) {
		driver.findElement(nameTextField).sendKeys(Name);
		driver.findElement(mailIdTextField).sendKeys(Email);
		
		driver.findElement(SubjectTextField).sendKeys(Subject);
		driver.findElement(messageField).sendKeys(Message);
	}
	
	public void Uploadfile() {
		driver.findElement(UploadFile).sendKeys("C:\\Users\\SKOMALI\\Downloads\\Internetbill April.pdf");
	}
	public void ClickSubmit() {
		driver.findElement(Submitbutton).click();
		driver.switchTo().alert().accept();
	}
	
	public String SuccessMesg() {
		String message=driver.findElement(SuccessMessage).getText();
	return message;
	}
	public void ClickHomebutton() {
		driver.findElement(HomeButton).click();
	}
	
}
