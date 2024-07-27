package com.stepde;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.Runner_class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class step_definition {
WebDriver driver=Runner_class.driver;
 WebDriverWait wait= new WebDriverWait(driver, 30);
	
	@Given("user launch the Adactin webpage")
	public void user_launch_the_adactin_webpage() {
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("user Enters The Username In The Username Field")
	public void user_enters_the_username_in_the_username_field() {
	    driver.findElement(By.id("username")).sendKeys("Admin1122");
	}

	@When("user Enters The Password In The Password Field")
	public void user_enters_the_password_in_the_password_field() {
	    driver.findElement(By.id("password")).sendKeys("Bgopi@2109");
	}

	@Then("user Clicks The Login Button And It Navigates To Search Hotel page")
	public void user_clicks_the_login_button_and_it_navigates_to_search_hotel_page() {
	   driver.findElement(By.id("login")).click();
	}
	@When("User selects location from the drop-down {string}")
	public void user_selects_location_from_the_drop_down(String string) {
        Select dropdown=new Select(driver.findElement(By.xpath("//select[@id=\"location\"]")));
        dropdown.selectByVisibleText("Sydney");
	}

	@When("User selects hotel from the drop-down {string}")
	public void user_selects_hotel_from_the_drop_down(String string) {
		 Select dropdown=new Select(driver.findElement(By.xpath("//select[@id=\"hotels\"]")));
	        dropdown.selectByVisibleText("Hotel Creek");
	}

	@When("User selects room type from the drop-down {string}")
	public void user_selects_room_type_from_the_drop_down(String string) {
	    Select dropdown =new Select (driver.findElement(By.xpath("//select[@id=\"room_type\"]")));
	    dropdown.selectByVisibleText("Standard");
	}

	@When("User selects number of rooms from the drop-down {string}")
	public void user_selects_number_of_rooms_from_the_drop_down(String string) {
	   Select dropdown= new Select ( driver.findElement(By.xpath("//select[@id=\"room_nos\"]")));
	   dropdown.selectByVisibleText("1 - One");
	}
@When("User selects adults per room from the drop-down {string}")
	public void user_selects_adults_per_room_from_the_drop_down(String string) {
	    Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"adult_room\"]")));
	    dropdown.selectByVisibleText("1 - One");
	}

	@When("User selects children per room from the drop-down {string}")
	public void user_selects_children_per_room_from_the_drop_down(String string) {
	    Select dropdown=new Select(driver.findElement(By.xpath("//select[@id=\"child_room\"]")));
	    dropdown.selectByVisibleText("1 - One");
	}

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
	    driver.findElement(By.id("Submit")).click();
	}

	//@Then("User is navigated to the select hotel page")
	//public void user_is_navigated_to_the_select_hotel_page() {
	  // String expectedurl="https://adactinhotelapp.com/SearchHotel.php";
	   //String actualurl=driver.getCurrentUrl();
	   //assert(expectedurl.equals(actualurl));
	//}

	@When("User selects a hotel")
	public void user_selects_a_hotel() {
	   WebElement hotelradiobutton = driver.findElement(By.xpath("//input[@type='radio' and @name='radiobutton_0']"));
	   hotelradiobutton.click();
	}
	
	
	@When("user click on the contiute button")
	public void user_click_on_the_contiute_button() {
	  driver.findElement(By.id("continue")).click();
	}

	@Then("scroll down the page")
	public void scroll_down_the_page() {
	   // Assuming scrolling is needed
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	}

	@When("user enters the firts name  in the first name field")
	public void user_enters_the_firts_name_in_the_first_name_field() {
	   driver.findElement(By.id("first_name")).sendKeys("mahalakshmi");
	}

	@When("user enters the last name in the last name field")
	public void user_enters_the_last_name_in_the_last_name_field() {
	    driver.findElement(By.id("last_name")).sendKeys("M");
	}

	@When("user enters the billing Address in addres field")
	public void user_enters_the_billing_address_in_addres_field() {
	    driver.findElement(By.id("address")).sendKeys("1/58 vallalar nagar");
	}

	@When("user enter the card number in card number field with {int} digit")
	public void user_enter_the_card_number_in_card_number_field_with_digit(Integer int1) {
	    driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
	}

	@When("user select credit card type from the drop-down\"American Express\"")
	public void user_select_credit_card_type_from_the_drop_down_american_express() {
	    Select dropdown=new Select (driver.findElement(By.id("cc_type")));
	    dropdown.selectByVisibleText("American Express");
	}

	@When("user select the expirydate field with select the month from the drop down {string}")
	public void user_select_the_expirydate_field_with_select_the_month_from_the_drop_down(String string) {
	    Select dropdown=new Select (driver.findElement(By.id("cc_exp_month")));
	    dropdown.selectByVisibleText("January");
	}

	@When("select the year from the drop down {string}")
	public void select_the_year_from_the_drop_down(String string) {
	    Select dropdown=new Select (driver.findElement(By.id("cc_exp_year")));
	    dropdown.selectByVisibleText("2025");
	}

	@And("also user enters the cvv number in cvv field {string}")
	public void   also_user_enters_the_cvv_number_in_cvv_field(String string) {
	    driver.findElement(By.id("cc_cvv")).sendKeys("1234");
	}

     @When("also user clicks the Book now button")
     public void also_user_clicks_the_book_now_button() {
    	 driver.findElement(By.id("book_now")).click();
}
     

     @Given("I click on the my Itinerary button")
     public void i_click_on_the_my_itinerary_button() {
    	 WebElement myItineraryButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='my_itinerary']")));
    	 myItineraryButton.click();
     }
 
     @Then("I should be redirected to the itinerary page")
     public void i_should_be_redirected_to_the_itinerary_page() {
        String expectedUrlFragment="BookedItinerary.php";
        assertTrue(driver.getCurrentUrl().contains(expectedUrlFragment));
     }

     @Then("I take a screenshot of the itinerary page")
     public void i_take_a_screenshot_of_the_itinerary_page() throws IOException {
         TakesScreenshot ts=(TakesScreenshot)driver;
         File source = ts.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(source, new File("itinerary_screenshot.png"));
     }

     @When("I click on the logout button")
     public void i_click_on_the_logout_button() {
         WebElement logoutButton = driver.findElement((By.xpath("//input[@value='Logout']")));
         logoutButton.click();
     }

     @Then("i should see the logout successful message")
     public void i_should_see_the_logout_successful_message() {
         WebElement logoutMessage = driver.findElement(By.xpath("//td[contains(text(),'You have successfully logged out')]"));
         
		assertTrue(logoutMessage.isDisplayed());
     }



     }

   
    



	




