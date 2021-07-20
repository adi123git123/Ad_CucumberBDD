package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions
{
    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;

    String loginPageExpectedTitle = "nopCommerce demo store. Login";
    String loginPageActualTitle;

    String  registerPageExpectedTitle = "nopCommerce demo store. Register";
    String  registerPageActualTitle;

    String registerExpectedSuccessMsg = "Your registration completed";
    String registerActualSuccessMsg;
    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.driverUtils.navigateToUrl(url);
    }

    @Then("i should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
        homePageActualTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
    }

    @When("i click on login link from the navbar")
    public void i_click_on_login_link_from_the_navbar()
    {
        BasePage.homePage.clickLoginLink();
    }

    @Then("i should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {
        loginPageActualTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(loginPageExpectedTitle,loginPageActualTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String em) {
        BasePage.loginPage.enterEmail(em);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String pw)
    {
        BasePage.loginPage.enterPassword(pw);
    }

    @When("i click on login button")
    public void i_click_on_login_button() {
        BasePage.loginPage.clickLoginBtn();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        BasePage.homePage.verifyLogout();
        BasePage.homePage.clickLogoutLink();
    }

    @When("i click on register link from the navbar")
    public void iClickOnRegisterLinkFromTheNavbar()
    {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be navigated to register page")
    public void iShouldBeNavigatedToRegisterPage()
    {
        registerPageActualTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle);

    }

    @When("i select the gender as male")
    public void iSelectTheGenderAsMale()
    {
        BasePage.registerPage.clickMaleRadioButton();
    }

    @And("i enter firstName lastName email password confirmPassword")
    public void iEnterFirstNameLastNameEmailPasswordConfirmPassword()
    {

    }

    @When("i select the gender as female")
    public void iSelectTheGenderAsFemale()
    {
        BasePage.registerPage.clickFemaleRadioButton();
    }
}
