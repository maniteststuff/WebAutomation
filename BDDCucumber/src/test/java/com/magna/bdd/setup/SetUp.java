package com.magna.bdd.setup;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetUp {

	public static WebDriver driver;

	public static final String AUTOMATE_USERNAME = "mytestingmytesti_OlGAWc";
	public static final String AUTOMATE_ACCESS_KEY = "bygWhG3nCSXK8pF86hZk";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriver() {
		// System.setProperty("webdriver.chrome.driver",
		// "./res/drivers/chromedriver.exe");
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();

		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "10");
			caps.setCapability("resolution", "1024x768");
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "89.0");
			caps.setCapability("os", "Windows");
			caps.setCapability("name", "BDD Remote Suite"); // test name
			caps.setCapability("build", "Remote Build 002"); // CI/CD job or build name

			driver = new RemoteWebDriver(new URL(URL), caps);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}
}
