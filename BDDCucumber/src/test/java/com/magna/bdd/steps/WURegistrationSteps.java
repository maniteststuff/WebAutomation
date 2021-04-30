package com.magna.bdd.steps;

import org.openqa.selenium.WebDriver;

import com.magna.bdd.pages.WURegistrationPage;
import com.magna.bdd.setup.SetUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WURegistrationSteps {

	WebDriver driver;
	WURegistrationPage regPage;

	@Given("User lunch the browser")
	public void user_lunch_the_browser() {
		SetUp.getDriver();
		driver = SetUp.driver;
	}

	@When("User enter the WU Registaration url")
	public void user_enter_the_WU_Registaration_url() {
		driver.get("https://www.westernunion.com/in/en/web/user/register");
		regPage = new WURegistrationPage(driver);
	}

	@Then("verify user is landed on WU Registaration Page")
	public void verify_user_is_landed_on_WU_Registaration_Page() throws InterruptedException{
		regPage.pageLanding();
	}

	@Then("User enter first name as (.*) in the field")
	public void user_enter_first_name_in_the_field(String firstName) {
		regPage.fillFirstName(firstName);
	}

	@Then("User enter middle name as (.*) in the field")
	public void user_enter_middle_name_in_the_field(String middleName) {
		regPage.fillMiddleName(middleName);
	}

	@Then("User enter last name as (.*) in the field")
	public void user_enter_last_name_in_the_field(String lastName) {
		regPage.fillLastName(lastName);
	}

}
