package workflow1.Ecom;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SigninPage;

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
	@Given("^I click the login link$")
	public void i_click_the_login_link() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.click_sign_in();
//		driver.findElement(By.linkText("Sign in")).click();

	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("davin.riches@gmail.com");

	}

	@Given("^I enter my password$")
	public void i_enter_my_password() throws Throwable {
		driver.findElement(By.name("passwd")).sendKeys("Today01");

	}

	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.click_login_button();

	}

	@Then("^I verify that I am logged in successfully$")
	public void i_verify_that_I_am_logged_in_successfully() throws Throwable {
		String expectedUser = "Davin Riches";
		String actualUser = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
		Assert.assertEquals(expectedUser, actualUser);
		//#header > div.nav > div > div > nav > div:nth-child(1) > a > span = css locator
		////*[@id="header"]/div[2]/div/div/nav/div[1]/a/span = xpath
	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
		myAccountPage.click_sign_out();

	}

	@Given("^I enter my email \"([^\"]*)\" address$")
	public void i_enter_my_email_address(String email) throws Throwable {
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.enter_email_address(email);
	}

	@Given("^I enter my password \"([^\"]*)\"$")
	public void i_enter_my_password(String password) throws Throwable {
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.enter_password(password);
	}

	@Given("^I enter my \"([^\"]*)\" address$")
	public void i_enter_my_address(String email) throws Throwable {
		driver.findElement(By.id("email_create")).sendKeys(email);

	}

	@Given("^I click on the create account button$")
	public void i_click_on_the_create_account_button() throws Throwable {
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		Thread.sleep(3000);

	}

	@Given("^I click on the male radio button$")
	public void i_click_on_the_male_radio_button() throws Throwable {
		driver.findElement(By.id("id_gender1")).click();

	}

	@Given("^I enter a firstname \"([^\"]*)\"$")
	public void i_enter_a_firstname(String firstname) throws Throwable {
		driver.findElement(By.id("customer_firstname")).sendKeys(firstname);

	}

	@Given("^I enter a lastname \"([^\"]*)\"$")
	public void i_enter_a_lastname(String lastname) throws Throwable {
		driver.findElement(By.id("customer_lastname")).sendKeys(lastname);

	}


	@And("^I enter a password \"([^\"]*)\"$")
	public void iEnterAPassword(String password) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@Given("^I enter date of birth$")
	public void i_enter_date_of_birth() throws Throwable {
		new Select(driver.findElement(By.id("days"))).selectByValue("1");

		Thread.sleep(2000);
		new Select(driver.findElement(By.id("months"))).selectByValue("7");
		new Select(driver.findElement(By.id("years"))).selectByValue("1986");
		Thread.sleep(2000);
	}

	@Given("^I enter address$")
	public void i_enter_address() throws Throwable {
		driver.findElement(By.id("company")).sendKeys("Bp Ltd");
		driver.findElement(By.id("address1")).sendKeys("1");
		driver.findElement(By.id("address2")).sendKeys("Park Road");

	}

	@Given("^I enter city$")
	public void i_enter_city() throws Throwable {
		driver.findElement(By.id("city")).sendKeys("Chicago");

	}

	@Given("^I enter state$")
	public void i_enter_state() throws Throwable {
		new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");

	}

	@Given("^I enter postal code$")
	public void i_enter_postal_code() throws Throwable {
		driver.findElement(By.id("postcode")).sendKeys("24378");

	}

	@Given("^I enter country$")
	public void i_enter_country() throws Throwable {
		new Select(driver.findElement(By.id("id_country"))).selectByVisibleText("United States");

	}

	@Given("^I enter mobile number$")
	public void i_enter_mobile_number() throws Throwable {
		driver.findElement(By.id("phone")).sendKeys("02078876920");

	}

	@When("^I click on register button$")
	public void i_click_on_register_button() throws Throwable {
		driver.findElement(By.id("submitAccount")).click();

	}


	@Then("^I verify that \"([^\"]*)\" is logged in$")
	public void iVerifyThatIsLoggedIn(String user) throws Throwable {
		MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
		myAccountPage.I_verify_my_account(user);
	//	Assert.assertEquals(user, driver.findElement(By.cssSelector("span")).getText());

	}

	@Then("^I sign out successfully$")
	public void i_sign_out_successfully() throws Throwable {

	}

	@And("^I enter my new email address$")
	public void iEnterMyNewEmailAddress() throws Throwable {
		random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
		System.out.println(random);
		driver.findElement(By.id("email_create")).sendKeys("mike" + random + "@gmail.com");

	}

	@Then("^I see an error \"([^\"]*)\" message details$")
	public void i_see_an_error_message_details(String errormessage) throws Throwable {
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.I_see_login_error_message(errormessage);
	}

	@When("^I search for \"([^\"]*)\" in the search input box$")
	public void i_search_for_in_the_search_input_box(String arg1) throws Throwable {
		driver.findElement(By.name("search query")).sendKeys("shirt");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(1000);

	}

	@Then("^I see \"([^\"]*)\" product listing page$")
	public void i_see_product_listing_page(String arg1) throws Throwable {
		Assert.assertEquals("1 result has been found", driver.findElement(By.cssSelector("#center_column > h1 > span.heading-counter")));

	}

	@Then("^I see search description \"([^\"]*)\" price \"([^\"]*)\" and item \"([^\"]*)\"$")
	public void i_see_search_description_price_and_item(String arg1, String arg2, String arg3) throws Throwable {
		Assert.assertEquals(arg1, driver.findElement(By.cssSelector("div.right-block > h5 > a")).getText());
		Assert.assertEquals(arg2, driver.findElement(By.cssSelector("div.right-block > div.content_price > span")).getText());
		Assert.assertEquals(arg3, driver.findElement(By.cssSelector("div > div.right-block > span > span")).getText());


	}


}




	

