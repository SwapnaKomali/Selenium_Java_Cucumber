package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddingProductstoCartpage;
import Pages.AddressCheckoutpage;
import Pages.Contactuspage;
import Pages.Loginpage;
import Pages.Placeorderpage;
import Pages.ScrolingFuntionalitypage;
import Pages.SearchProductpage;
import Pages.ViewCategorypage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllStepDefinitions {

	 WebDriver driver = null;
	 Loginpage page ;
	 Contactuspage contactpage;
	 SearchProductpage SearchPage;
	 ScrolingFuntionalitypage scroll;
	 AddingProductstoCartpage addcart;
	 ViewCategorypage Category;
	 AddressCheckoutpage address;
	 Placeorderpage order;
	 
	 
	 
//1>StepDefinations for Loginpage
	          @Given("user is able to open the URL")
		       public void user_is_able_to_open_the_url() {
		       System.out.println("I am inside the browser ");
		       System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKOMALI\\eclipse-workspace\\Testing-Cucumber\\src\\main\\resources\\driver\\chromedriver.exe");
	           driver = new ChromeDriver();
	           driver.manage().window().maximize();
	           driver.get("https://automationexercise.com/");
	        
	            contactpage=new Contactuspage(driver);
	            System.out.println("user lauanced the URL");
	 }
	 
	        @Given("user is click on  sign up button")
	        public void user_is_click_on_signup_login_button()
	        {	        	 
	        	 page = new Loginpage(driver);	        
	        	 page.clickloginbutton();	        	
	        
	        }
	        
	        @When("user enters incorrect {string} and {string}")
	        public void user_enters_incorrect_email_and_password(String mailId,String pwd) 
	        {
	        	page = new Loginpage(driver);
	        	page.enteremailandpassword(mailId,pwd);
	        }

	        @Then("user should see an error message")
	        public void user_should_see_an_error_message() {
	        	page = new Loginpage(driver);
	        	System.out.println("Error message :"+ page.getErrorMessage());      	
	          	page.tearDownBrowser();	        	
	        }

	

//	@When("user enters incorrect email and password")
//	public void user_enters_incorrect_email_and_password() {
//		
//		 WebElement email=driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
//        WebElement passwordInput = driver.findElement(By.xpath("//input[@type=\"password\"]"));
//        WebElement submitButton = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
//        
//        
//        email.sendKeys("komaliswapan@gmail.com");
//        passwordInput.sendKeys("Rupa@0063");
//        submitButton.click();
//       
//	    
//	}
//
//	@Then("user should see an error message")
//	public void user_should_see_an_error_message() {
//		 WebElement errorMessage = driver.findElement(By.xpath("//p[contains(text(),\"Your email or password is incorrect!\")]"));
//	        String expectedErrorMessage = "Your email or password is incorrect!";
//	        assert(errorMessage.getText().equals(expectedErrorMessage));
//	        driver.quit();
//	}
//
//
	        
	        
	        
//2>step definitions for contact us form page
	        
	        @And("Verify that home page is visible successfully")
	    	public void ValididateHomePage() {
	    		contactpage=new Contactuspage(driver);
	    		if(contactpage.HomebuttonisPresent()==(true)) {
	    			System.out.println("User is on Home Page");
	    		}
	    		else {
	    			System.out.println("User is not on Home Page");
	    		}
	    		
	    	}
	    	
	    	
	    	@When ("Click on Contact Us button and verify {string} is visible")
	       public void ClickContactVerifyHeaderName(String HeaderName) 
	    	{
              contactpage=new Contactuspage(driver);
	    		
	    		contactpage.clickonContactbutton();
	    		if(contactpage.VerifyGetinTouchText()==(true)){
	    			System.out.println("HeaderName displayed as: " +HeaderName);
	    		}
	    	}
	    	

	    	
	    	
	      
	        @Then ("Enter {string}, {string}, {string} and {string}")
	        public void EnterContactDetails(String Name,String Email,String Subject,String Message) {
	        	contactpage=new Contactuspage(driver);
	        	
	        	contactpage.enterContactDetails(Name, Email, Subject, Message);
	        	
	        	
	        }
	        
	        @And ("Upload File in Contact Form")
	        
	        public void UploadFile() {
	        	contactpage=new Contactuspage(driver);
	        	contactpage.Uploadfile();
	        }
	        
	        
	        @Then ("Click on Submit Button")
	        public void ClickSubmitonContact() {
	        	contactpage=new Contactuspage(driver);
	        	contactpage.ClickSubmit();
	        }
	        
	        @And ("Verify Success Message")
	        public void Validatesuccessmessage() {
	        	contactpage=new Contactuspage(driver);
	        	if(contactpage.SuccessMesg().contains("Success!")) {
	        		System.out.println("Success message displayed");
	        	}
	        	else {
	        		System.out.println("Success message is not displayed");
	        	}
	        }
	        
	        
	        
	        @Then ("Click on home button and verify home page")
	        public void clickHomeButtonAndVerifyHomepage() {
	        	contactpage=new Contactuspage(driver);
	        	contactpage.ClickHomebutton();
	        	ValididateHomePage();
	        	page.tearDownBrowser();	 
	        }
	        
	        
	        
	        
	        
 //3>Stepdefinitions for SearchProductpage
	        
	        @When("click on Products button and verify {string} page is visible")
	        public void ClickproductbuttonandverifyHeader(String Header) {
	        	SearchPage=new SearchProductpage(driver);
	        	SearchPage.ClickProductButton();
	        	if(SearchPage.ProductsTextField().equals(Header));{
	        		System.out.println("HeaderName : "+SearchPage.ProductsTextField());
	        	}
	        	
	        }
	        
	        
	        @Then("Enter product name in search input and click search button")
	        public void enter_product_name_in_search_input_and_click_search_button() {
	        	SearchPage=new SearchProductpage(driver);
	        	SearchPage.ClickSearchProduct();
	        	SearchPage.ClicksearchSymbol();
	        
	        }
	        
	        
	        
	        @Then("verify {string} is visible")
	        public void verify_is_visible(String productTEXT) {	        	
	        	SearchPage=new SearchProductpage(driver);
	        	if(SearchPage.SearchedTextField()==(true)){
	        		System.out.println("Headername displayed as : " +productTEXT );	        		
	        	}
	        	else {
	        		System.out.println("Headername not displayed as : " +productTEXT );
	        	}
	        }
	        	
	        	@And("Verify all the products related to {string} are visible")	        	
	        	public void ValidateProductsonDisplay(String Value){
	        		SearchPage=new SearchProductpage(driver);
	        		page = new Loginpage(driver);	
	        		if(SearchPage.verifySearchedProduct().equals(Value)) {
	        			System.out.println("Products are Validated");
	        			
	        		}
	        		page.tearDownBrowser();
	        	}
	        	
	        	
	        	
	        	
//4> stpesdefinations for scrollingpage
	       
	     
	        	@When("Scrolldown page to bottom and Verify SUBSCRIPTION is visible")
	        	public void scrolldown_page_to_bottom_and_verify_subscription_is_visible() {
	        	    scroll= new ScrolingFuntionalitypage(driver);
	        		scroll.Scrolldown();
	        		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        		System.out.println(" Subscription text is displayed : " + scroll.subscriptionTextisDisplayed());
	        	}

	        	@Then("Scrollup page to top")
	        	public void scrollup_page_to_top() {
	        		 scroll= new ScrolingFuntionalitypage(driver);
	        	    scroll.Scrollup();
	        	} 

	        	@Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
	        	public void verify_that_page_is_scrolled_up_and_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
	        		 scroll= new ScrolingFuntionalitypage(driver);
	        		 page = new Loginpage(driver);	
	        		 if(scroll.VerifyText()) {
	        			 System.out.println("Text is  Displayed : "+scroll.VerifyText());
	        		 }
	        		 else {
	        			 System.out.println("Text is  not Displayed  ");
	        		 }
	        		 page.tearDownBrowser();
	        	}
	        	
	        	
	        	
	        	
//5>StepDefinations for Products Add to cart 
	        	
	        	
	        	@Then("Hover over first product and click Add to cart")
	        	public void hover_over_first_product_and_click() {
	        	    addcart=new AddingProductstoCartpage(driver);
	        	    JavascriptExecutor js = (JavascriptExecutor) driver;
	        	    js.executeScript("window.scrollBy(0,600)", "");
	        	   // addcart.scrolldown();
	        	    addcart.AddCart1();
	        	    
	        	    
	        	    
	        	}

	        	@Then("Click Continue Shopping button")
	        	public void click_button() {
	        		addcart=new AddingProductstoCartpage(driver);
	        		addcart.ClickContinuebtton();
	        		
	        		
	        	}

	        	@Then("Hover over second product and click Add to cart")
	        	public void hover_over_second_product_and_click() {
	        		addcart=new AddingProductstoCartpage(driver);
	        		addcart.AddCart2();
	        		
	        	}
	        	
	        	@And ("Click View Cart button")
	        	 public void viewcartbutton() {
	        		addcart=new AddingProductstoCartpage(driver);
	        		addcart.ViewCartButton();
	        	}

	        	@Then("Verify both products are added to Cart")
	        	public void verify_both_products_are_added_to_cart() {
	        		addcart=new AddingProductstoCartpage(driver);
	        	    addcart.ViewCartButton();
	        	    System.out.println("Selected products are displayed : "+ addcart.VerifyCartproducts());
	        		
	        		
	        	}

	        	@Then("Verify their prices, quantity and total price")
	        	public void verify_their_prices_quantity_and_total_price() {
	        		addcart=new AddingProductstoCartpage(driver);
	        		if(addcart.verifyprice_qty_totalPriceAreDisplayed()) {
	        			System.out.println(" All values in Cart are displayed: "+addcart.verifyprice_qty_totalPriceAreDisplayed());
	        		}	        		
	        		 page.tearDownBrowser();
	        	}
	        	
	        	
 //6>Stepdefinations for Viewcategorypage
	        	
	        	
	        	
	        	@Then("Verify that {string} are visible on left side bar")
	        	public void verify_that_are_visible_on_left_side_bar(String textname) {
	        		
	        		Category = new ViewCategorypage(driver);
	        		System.out.println("Textname :" + Category.verifyCategoryField());
	        		if(Category.verifyCategoryField().equals(textname)){
	        			
	        			System.out.println("Category is displayed");
	        		}
	        		
	        		else
	        		{
	        			System.out.println("Category is not displayed");
	        		}
	        	}

	        	@Then("Click on Women category")
	        	public void click_on_women_category() {
	        		Category = new ViewCategorypage(driver);
	        		Category.clickonwomenButton();
	        	}

	        	@When("Click on any category link under Women category")
	        	public void click_on_any_category_link_under_women_category() {
	        		Category = new ViewCategorypage(driver);
	        		Category.ClickOnTopbutton();
	        	}

	        	@When("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
	        	public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() {
	        		Category = new ViewCategorypage(driver);
	        		if(Category.VerifyTextField()){
	        			System.out.println("WOMEN - TOPS PRODUCTS is Displayed");
	        		}
	        		else {
	        			System.out.println("WOMEN - TOPS PRODUCTS is not Displayed");
	        		}
	        	}

	        	@When("click on any sub-category link of Men category")
	        	public void click_on_any_sub_category_link_of_men_category() {
	        		Category = new ViewCategorypage(driver);
	        		Category.ClickOnmenButton();
	        		Category.clickonTshirt();
	        	}

	        	@When("Verify that user is navigated to that category page")
	        	public void verify_that_user_is_navigated_to_that_category_page() {
	        		Category = new ViewCategorypage(driver);
	        		if(Category.VerifyMenTextfield()) {
	        			System.out.println("MEN - TSHIRTS PRODUCTS  is Displayed");
	        		}
	        		else {
	        			System.out.println("MEN - TSHIRTS PRODUCTS  is not Displayed");
	        		}
	        		 page.tearDownBrowser();
	        	}

	        	
//7>Step Definations for AddressCheckoutPage
	        	 
	        	

	        	@Then("Fill all details in Signup and create account")
	        	public void fill_all_details_in_signup_and_create_account() {
	        	    
	        		address =new AddressCheckoutpage(driver);
	        		   address.CreateAccount();
	        		   
	        		
	        	}
	        	
	        	

	        	@Then("Verify ACCOUNT CREATED! and click Continue button")
	        	public void verify_account_created_and_click_continue_button() {
	        	
	        		 address =new AddressCheckoutpage(driver);
	        			
	        			if(address.VeriftAcuntTextField()){
	        			   System.out.println("ACCOUNT CREATED! is displayed");
	        		   }
	        		   else {
	        			   System.out.println("ACCOUNT CREATED! is not displayed");
	        		   }
	        		   address.ClickContinuebutton();
	        	}
	        	
	        	

	        	@Then("Verify Logged in as username at top")
	        	public void verify_logged_in_as_username_at_top() {
	        		address =new AddressCheckoutpage(driver);
	        		if(address.VerifyLoginNameText()){
	        			System.out.println("Logged in as Swapna is Displayed");
	        		}
	        		else {
	        			System.out.println("Logged in as Swapna is not Displayed");
	        		}
	        		
	        	}
	        	
	        	
	        	

	        	@Then("and Click Proceed To Checkout")
	        	public void and_click_proceed_to_checkout() {
	        		address =new AddressCheckoutpage(driver);
	        		
	        		address.ClickonProceedtoCheckout();
	        	}
	        	
	        
	        	@Then("Verify that the delivery address is same address filled at the time registration of account")
	        	public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() {
	        		address =new AddressCheckoutpage(driver);
	        		
	        		if(address.VerifyDeliveryAddress()) {
	        			System.out.println("India is Displayed");
	        		}
	        		else {
	        			System.out.println("India is Displayed");
	        		}
	        	}
	        	
	        	
	        	

	        	@Then("Verify that the billing address is same address filled at the time registration of account")
	        	public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() {
	        		address =new AddressCheckoutpage(driver);
	        		
	        		if(address.verifyBillingAddress()) {
	        			System.out.println("india is Displayed");
	        		}
	        		else {
	        			System.out.println("india  not  Displayed");
	        		}
	        		}
	        		
	        	
	        	@Then("Click Delete Account button")
	        	public void click_delete_account_button() {
	        		address =new AddressCheckoutpage(driver);
	        		address.ClickdeleteAccount();
	        	}
	        	
	        	

	        	@Then("Verify ACCOUNT DELETED!and click Continue button")
	        	public void verify_account_deleted_and_click_continue_button() {
	        		address =new AddressCheckoutpage(driver);
	        		
	        		if(address.VerifydeletedText()) {
	        			System.out.println("ACCOUNT DELETED!  is Displayed");
	        			
	        		}
	        		else {
	        			System.out.println("ACCOUNT DELETED!  is Displayed");
	        		}
	        		address.ClickonfinalcontinueButton();
	        		
	        		 page.tearDownBrowser();
	        		
	        	}

	        	
	        	
//8>StepDefinationsfor Placeorderpage    
	        	
	        	
	        	
	        	@Then("Enter description in comment text area and click Place Order")
	        	public void enter_description_in_comment_text_area_and_click_place_order() {
	        	   
	        		order=new Placeorderpage(driver);
	        		order.EnterComment();
	        		order.ClickonPlaceOrderbutton();
	        	}
	        	
	        	
	        	
	        	@Then("Enter payment details")
	        	public void enter_payment_details() {
	        		order=new Placeorderpage(driver);
	        		order.EnterPaymentDetails();
	        		
	        		
	        	}
	        	
	        	
	        	@Then("Click Pay and Confirm Order button")
	        	public void click_pay_and_confirm_order_button() {
	        		order=new Placeorderpage(driver);
	        		order.ClickonpayandPlaceOrder();
	        	}
	        	
	        	
	        	@Then("Verify success message Your order has been placed successfully!")
	        	public void verify_success_message_your_order_has_been_placed_successfully() {
	        		order=new Placeorderpage(driver);
	        		if(order.VerifySuccessmesg()) {
	        			System.out.println("Your order has been placed successfully!  is Displayed");
	        		}
	        		else {
	        			System.out.println("Your order has been placed successfully!  is Displayed");
	        		}
	        		 page.tearDownBrowser();
	        	}
	        	
}
