package com.magna.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "res/features", glue = "com.magna.bdd.steps", monochrome = true, plugin = { "pretty",
		"json:target/cucumber-jvm-report/cucumber.json" }, tags = {"@Regression"})
public class TestRunner {

}