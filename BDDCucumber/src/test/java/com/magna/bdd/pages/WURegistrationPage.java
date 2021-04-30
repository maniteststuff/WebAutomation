package com.magna.bdd.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WURegistrationPage {

	public WebDriver driver;

	public WURegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id = 'firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id = 'middleName']")
	WebElement middleName;

	@FindBy(xpath = "//input[@id = 'lastName']")
	WebElement lastName;

	@FindBy(xpath = "//img[@alt = 'logo']")
	WebElement logoName;

	public void pageLanding() throws InterruptedException {
		assertEquals(driver.getCurrentUrl(), "https://www.westernunion.com/in/en/web/user/register");
		assertEquals(driver.getTitle(), "Register a profile with Western Union IN");

		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//img[@alt = 'logo']")).isDisplayed());
	}

	public void fillFirstName(String firstNameValue) {
		assertTrue(firstName.isDisplayed());
		firstName.sendKeys(firstNameValue);
	}

	public void fillMiddleName(String middleNameValue) {
		assertTrue(middleName.isDisplayed());
		middleName.sendKeys(middleNameValue);
	}

	public void fillLastName(String lastNameValue) {
		assertTrue(lastName.isDisplayed());
		lastName.sendKeys(lastNameValue);
	}

}
