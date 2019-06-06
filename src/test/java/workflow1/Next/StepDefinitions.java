package workflow1.Next;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

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

	@Given("^I click my account$")
	public void i_click_my_account() throws Throwable {
		//driver.findElement(By.cssSelector("body > div.CookieConsent.hide-in-app-mode > div")).click();
		driver.findElement(By.linkText("My Account")).click();

	}

	@Given("^I click continue on the new customers side$")
	public void i_click_continue_on_the_new_customers_side() throws Throwable {
		driver.findElement(By.cssSelector(".primary")).click();

	}

	@Given("^I enter my title$")
	public void i_enter_my_title() throws Throwable {
		//driver.findElement(By.id("Title")).click();
		new Select(driver.findElement(By.id("Title"))).selectByValue("Mr");

	}

	@Given("^I enter a firstname \"([^\"]*)\"$")
	public void i_enter_a_firstname(String firstname) throws Throwable {
		driver.findElement(By.id("FirstName")).sendKeys(firstname);

	}

	@Given("^I enter a lastname \"([^\"]*)\"$")
	public void i_enter_a_lastname(String lastname) throws Throwable {
		driver.findElement(By.id("LastName")).sendKeys(lastname);

	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
		random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
		System.out.println(random);
		driver.findElement(By.id("Email")).sendKeys("jotesanya97" + random + "@gmail.com");

	}

	//@Given("^I click the sign up button$")
	//public void i_click_the_sign_up_button() throws Throwable {


	@Given("^I enter my password$")
	public void i_enter_my_password() throws Throwable {
		driver.findElement(By.id("Password")).sendKeys("Today01");

	}

	@Given("^I enter my date of birth$")
	public void i_enter_my_date_of_birth() throws Throwable {
		driver.findElement(By.id("DobDate")).sendKeys("08 08 97");

	}

	@Given("^I enter my contact telephone number$")
	public void i_enter_my_contact_telephone_number() throws Throwable {
		driver.findElement(By.id("PhoneNumber")).sendKeys("07736229889");

	}


	@Given("^I enter my house number or name$")
	public void i_enter_my_house_number_or_name() throws Throwable {
		driver.findElement(By.id("HouseNumberOrName")).sendKeys("48");

	}

	@Given("^I enter my postcode$")
	public void i_enter_my_postcode() throws Throwable {
		driver.findElement(By.id("Postcode")).sendKeys("n17 9eb");

	}

	@Given("^I click search$")
	public void i_click_search() throws Throwable {
		driver.findElement(By.id("SearchPostcode")).click();

	}

	@Given("^I click no$")
	public void i_click_no() throws Throwable {
		driver.findElement(By.cssSelector(".js:nth-child(4)")).click();

	}

	@Given("^I click on the post tick box$")
	public void i_click_on_the_post_tick_box() throws Throwable {
		driver.findElement(By.cssSelector(".row:nth-child(1) > .col-xs-6:nth-child(2) .js")).click();

	}

	@Given("^I click on the telephone tickbox$")
	public void i_click_on_the_telephone_tickbox() throws Throwable {
		driver.findElement(By.cssSelector("#register_form > div.container.next-marketing > div > div:nth-child(1) > div:nth-child(3) > div > label")).click();

	}

	@Given("^I click on the SMS tickbox$")
	public void i_click_on_the_SMS_tickbox() throws Throwable {
		driver.findElement(By.cssSelector(".col-xs-6:nth-child(4) .js")).click();

	}

	@Given("^I click on the Email tickbox$")
	public void i_click_on_the_Email_tickbox() throws Throwable {
		driver.findElement(By.cssSelector("#register_form > div.container.next-marketing > div > div:nth-child(1) > div:nth-child(5) > div > label")).click();

	}

	@Given("^I click register my account$")
	public void i_click_register_my_account() throws Throwable {
		driver.findElement(By.id("SignupButton")).click();

	}

	@When("^I verify that \"([^\"]*)\" is logged in$")
	public void i_verify_that_is_logged_in(String user) throws Throwable {
		Assert.assertEquals(user, driver.findElement(By.cssSelector("body > header > div > section > section.QuickLinks > ul > li:nth-child(1) > a")).getText());

	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		driver.findElement(By.cssSelector("body > header > div > section > section.QuickLinks > ul > li:nth-child(1) > a")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > header > div > section > section.QuickLinks > ul > div > span:nth-child(3) > a")).click();
	}


	@And("^I click shop now$")
	public void iClickShopNow() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"welcome-wrapper\"]/div[2]/div[2]/div/div/a")).click();

	}

	@Given("^I click continue and register$")
	public void i_click_continue_and_register() throws Throwable {
		//driver.findElement(By.id("accMatchContinue")).click();
		driver.findElement(By.xpath("//*[@id=\"accMatchContinue\"]")).click();

	}

	@Given("^I enter my email \"([^\"]*)\" address$")
	public void i_enter_my_email_address(String email) throws Throwable {

		driver.findElement(By.cssSelector("#passwordLogin > div:nth-child(2) > div > div")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("EmailOrAccountNumber")).clear();
		driver.findElement(By.name("EmailOrAccountNumber")).sendKeys(email);
	}

	@And("^I enter my password \"([^\"]*)\"$")
	public void iEnterMyPassword(String password) throws Throwable {
		driver.findElement(By.id("Password")).sendKeys(password);
	}


	@Given("^I click the sign in now button$")
	public void i_click_the_sign_in_now_button() throws Throwable {
		driver.findElement(By.id("SignInNow")).click();

	}

	@Then("^I want to see an error \"([^\"]*)\" error message details$")
	public void i_want_to_see_an_error_error_message_details(String errormessage) throws Throwable {
		Assert.assertEquals(errormessage, driver.findElement(By.cssSelector("#pri > div > div > div > div.msgContent > span")).getText());


	}
	@Given("^I clear the email input field$")
	public void i_clear_the_email_input_field() throws Throwable {
		driver.findElement(By.id("EmailOrAccountNumber")).clear();
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("#passwordLogin > div:nth-child(2) > div > div")).click();
		driver.findElement(By.cssSelector("#passwordLogin > div:nth-child(2) > div > div")).click();
	}

	@When("^I click on the search button$")
	public void i_click_on_the_search_button() throws Throwable {
		driver.findElement(By.cssSelector("#newsearch > input.SearchButton")).click();

	}

	@Then("^I click on the item I want$")
	public void i_click_on_the_item_I_want() throws Throwable {
		driver.findElement(By.cssSelector("#i1 > section > div.Images > a > img")).click();

	}
	@Given("^I type \"([^\"]*)\" in the search input box$")
	public void i_type_in_the_search_input_box(String Shoes) throws Throwable {
		driver.findElement(By.name("w")).sendKeys(Shoes);
	}


	}






