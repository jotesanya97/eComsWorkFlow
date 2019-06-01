package workflow1.Ecom2;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.io.IOException;

public class StepDefinitions extends testBase {

	@Before
	public void setup() throws IOException {
		initialize();
	}


	@Given("^I go to the Home Page$")
	public void i_go_to_the_Home_Page() throws Throwable {
		driver.get(CONFIG.getProperty("URL"));
	}

	@Given("^I click the sign up button$")
	public void i_click_the_sign_up_button() throws Throwable {
		driver.findElement(By.cssSelector(".btn-border")).click();
	}

	@Given("^I enter my new email address$")
	public void i_enter_my_new_email_address() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("jotesanya97@gmail.com");
	}

	@Given("^I enter my phone number$")
	public void i_enter_my_phone_number() throws Throwable {
		driver.findElement(By.id("phone_number")).sendKeys("07736229889");
	}

	@Given("^I verify my phone number via text message$")
	public void i_verify_my_phone_number_via_text_message() throws Throwable {
		driver.findElement(By.cssSelector(".dropdown:nth-child(3)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".transition > .item:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("body > div.ui.middle.aligned.center.aligned.grid > div > div.ui.raised.segment > div.row > form > div:nth-child(4) > div > i")).click();
		//Thread.sleep(2000);

	}

	@Given("^I click agree to the terms and conditions$")
	public void i_click_agree_to_the_terms_and_conditions() throws Throwable {
		driver.findElement(By.cssSelector(".form")).click();

	}

	@Given("^I click the I am not a robot box$")
	public void i_click_the_I_am_not_a_robot_box() throws Throwable {


	}

	@Given("^I type my validation code in the verification field$")
	public void i_type_my_validation_code_in_the_verification_field() throws Throwable {

	}

	@Given("^I click submit$")
	public void i_click_submit() throws Throwable {

	}

	@Given("^I would go to my mail box$")
	public void i_would_go_to_my_mail_box() throws Throwable {

	}

	@Given("^I click the link to validate my account$")
	public void i_click_the_link_to_validate_my_account() throws Throwable {

	}

	@Given("^I enter my company name$")
	public void i_enter_my_company_name() throws Throwable {

	}

	@Given("^I enter a firstname \"([^\"]*)\"$")
	public void i_enter_a_firstname(String arg1) throws Throwable {

	}

	@Given("^I enter a lastname \"([^\"]*)\"$")
	public void i_enter_a_lastname(String arg1) throws Throwable {

	}

	@Given("^I enter a password \"([^\"]*)\"$")
	public void i_enter_a_password(String arg1) throws Throwable {

	}

	@Given("^I confirm the password$")
	public void i_confirm_the_password() throws Throwable {

	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {

	}

	@Given("^I enter my password$")
	public void i_enter_my_password() throws Throwable {

	}

	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
		driver.findElement(By.cssSelector("#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button")).click();

	}

	@Then("^I verify that \"([^\"]*)\" is logged in$")
	public void i_verify_that_is_logged_in(String args) throws Throwable {
		String expectedUser = "James Otesanya";
		String actualUser = driver.findElement(By.cssSelector("#top-header-menu > div.right.menu > span.user-display")).getText();
		//Assert.assertEquals(expectedUser, actualUser);


	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		driver.findElement(By.cssSelector("#top-header-menu > div.right.menu > div.ui.buttons > div > i")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#top-header-menu > div.right.menu > div.ui.buttons > div > div.menu.transition.visible > a:nth-child(4) > span")).click();
		//driver.findElement(By.cssSelector("#top-header-menu > div.right.menu > div.ui.buttons > div")).click();


	}

	@Given("^I click the login link$")
	public void i_click_the_login_link() throws Throwable {
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn-xs-2 > span:nth-child(2)")).click();


	}

	@Given("^I enter my email \"([^\"]*)\" address$")
	public void i_enter_my_email_address(String email) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(email);

	}

	@Given("^I enter my password \"([^\"]*)\"$")
	public void i_enter_my_password(String password) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Given("^I click on the forgot your password link$")
	public void i_click_on_the_forgot_your_password_link() throws Throwable {
		driver.findElement(By.cssSelector("#ui > div > div > div:nth-child(2) > a")).click();
	}

	@When("^I enter my email in the enter email field$")
	public void i_enter_my_email_in_the_enter_email_field() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("jotesanya97@gmail.com");

	}

	@Then("^I click reset password$")
	public void i_click_reset_password() throws Throwable {
		driver.findElement(By.name("action")).click();

	}
	@Then("^I want to see an error \"([^\"]*)\" error message details$")
	public void i_want_to_see_an_error_error_message_details(String errormessage) throws Throwable {
		//driver.findElement(By.cssSelector("#ui > div > div > form > div > div.ui.negative.message > p")).getText();
		//Assert.assertEquals(errormessage, driver.findElement(By.cssSelector("span")).getText());
		driver.findElement(By.cssSelector("#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button")).click();
		Thread.sleep(2000);


	}

}



	

