package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;

@Given("User should be in the facebook login page")
public void a() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@When("User should enter the username and password")
public void b() {
	driver.findElement(By.id("email")).sendKeys("greens");
	driver.findElement(By.id("pass")).sendKeys("qwerty");
}

@When("user should select the login button")
public void c() {
	driver.findElement(By.name("login")).click();
}

@Then("Verify the login is successful")
public void d() {
	System.out.println("Done.....");
   
}

}
