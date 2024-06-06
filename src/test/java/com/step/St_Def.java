package com.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.ui.Select;

import com.ad_testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class St_Def {
	
	WebDriver driver = TestRunner.driver;
	
@Given("user launch the application by given Url")
public void user_launch_the_application_by_given_Url() throws Throwable {
	driver.get("https://adactinhotelapp.com/");
	System.out.println("I am on home page");
}

@When("user enter the username in username field")
public void user_enter_the_username_in_username_field() throws Throwable {
		
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("baluchellam5");
	}

@When("user enter the password in password field")
public void user_enter_the_password_in_password_field() throws Throwable {
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("HC4E50");
}

@Then("user click the Login button")
public void user_click_the_Login_button() throws Throwable {
	driver.findElement(By.xpath("//input[@id='login']")).click();
	System.out.println("I am in Page No ");
}

@Given("user select the location in select location dropdown")
public void user_select_the_location_in_select_location_dropdown() throws Throwable {
	WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
	Select s = new Select(location);
	s.selectByIndex(4);
}

@When("user select the hotels in select hotel dropdown")
public void user_select_the_hotels_in_select_hotel_dropdown() throws Throwable {
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
	}

@When("user select the room type in roomtype dropdown")
public void user_select_the_room_type_in_roomtype_dropdown() throws Throwable {
	
	WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
	Select s2 = new Select(roomtype);
	s2.selectByVisibleText("Super Deluxe");
	}

@When("user select the number of rooms in no of rooms dropdown")
public void user_select_the_number_of_rooms_in_no_of_rooms_dropdown() throws Throwable {
		
	WebElement no_ofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
	Select s3 = new Select(no_ofrooms);
	s3.selectByIndex(1);
	}

@When("user select the adults no in No of Adults per room dropdown")
public void user_select_the_adults_no_in_No_of_Adults_per_room_dropdown() throws Throwable {
	
	WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select s4 = new Select(adults);
	s4.selectByVisibleText("2 - Two");
	}

@When("user select the no of children in children per room dropdown")
public void user_select_the_no_of_children_in_children_per_room_dropdown() throws Throwable {
	
	WebElement childs = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select s5 = new Select(childs);
	s5.selectByIndex(2);
	}

@Then("user click the search button")
public void user_click_the_search_button() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id='Submit']")).click();
	System.out.println("I am in Page NO 2 ");
	}

@Given("user select the select button")
public void user_select_the_select_button() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	}

@Then("user click the continue button")
public void user_click_the_continue_button() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	System.out.println("I am in Page No 3");
	}

@Given("user enter the first name in first name field")
public void user_enter_the_first_name_in_first_name_field() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Rajini");
	}

@When("user enter the last name in last name field")
public void user_enter_the_last_name_in_last_name_field() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kanth");
	}

@When("user enter Billing address in Billing address field")
public void user_enter_Billing_address_in_Billing_address_field() throws Throwable {
	
	driver.findElement(By.xpath("//textarea[@id='address']"))
	.sendKeys("No.108, Dubai kuruku sandhu, Dubai Main road, Dubai");
	}

@When("user enter the card number in credit card field")
public void user_enter_the_card_number_in_credit_card_field() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234 5678 1234 5678");
	}

@When("user select the credit card type in credit card type dropdown")
public void user_select_the_credit_card_type_in_credit_card_type_dropdown() throws Throwable {
	
	WebElement cctype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	Select c = new Select(cctype);
	c.selectByIndex(1);
	}

@When("user select the expiry month in expiry date dropdown")
public void user_select_the_expiry_month_in_expiry_date_dropdown() throws Throwable {
	
	WebElement ccmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	Select cc = new Select(ccmonth);
	cc.selectByIndex(4);
	}

@When("user select the expiry year in expiry year dropdown")
public void user_select_the_expiry_year_in_expiry_year_dropdown() throws Throwable {
	
	WebElement ccyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select cc1 = new Select(ccyear);
	cc1.selectByValue("2030");
	}

@When("user enter the cvv number in cvv number field")
public void user_enter_the_cvv_number_in_cvv_number_field() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
	}

@Then("user click the book now button")
public void user_click_the_book_now_button() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id='book_now']")).click();
	Thread.sleep(6000);
	System.out.println("I am on Page No 4");
	}

@Given("user click the My itenary in My itenary field")
public void user_click_the_My_itenary_in_My_itenary_field() throws Throwable {
	
	driver.findElement(By.xpath("(//input [@type = 'button'])[2]")).click();
	Thread.sleep(9000);
	System.out.println("I am On Page NO 5");
	}

@Given("user select the logout page and click the button")
public void user_select_the_logout_page_and_click_the_button() throws Throwable {
	Thread.sleep(5000);
	//driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	WebElement logoutElement = driver.findElement(By.id("logout"));
	Actions actions = new Actions(driver);
	actions.moveToElement(logoutElement);
	
	//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	//jsExecutor.executeScript(ScrollAction, null);
	
	//driver.findElement(By.xpath("( //input[@class = 'reg_button'])[3]")).click();
	System.out.println(" I am On Pge No 6 ");
	}



}
