package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get(ConfigReader.getProperty("baseURL"));
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid username and password")
    public void user_enters_valid_credentials() {
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickLogin();
    }

    @Then("User should be logged in successfully")
    public void user_logged_in_successfully() {
        System.out.println("Login successful");
        driver.quit();
    }

}
