package com.sungard.jopportal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPJUnit extends TestCase {
	FirefoxDriver driver ;
	@Given("^email/user$")
	public void email_user() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver = new FirefoxDriver();
		String baseUrl = "C:\\Users\\Narendra\\Downloads\\collegeportal\\collegeportal\\index.html";
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get(baseUrl);
		driver.findElementByName("userid").sendKeys("Dhoni");
		driver.findElementByName("passid").sendKeys("Dhoni@2015");
		driver.findElementByName("username").sendKeys("DhoniCWC2015");
		driver.findElementByName("address").sendKeys("Chennai");
		driver.findElementByName("city").sendKeys("Pune");
		driver.findElementByName("email").sendKeys("dhoni.india@bcci.com");
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		driver.findElementByName("submit").click();
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MILLISECONDS);
		String successUrl = "C:\\Users\\Narendra\\Downloads\\collegeportal\\collegeportal\\success.html";
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get(successUrl);
	}

	@When("^on submit of new profile$")
	public void on_submit_of_new_profile() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^search in db whether it already exists ,throw validation$")
	public void search_in_db_whether_it_already_exists_throw_validation() throws Throwable {
//	    driver.findElementByName("result").sendKeys("User created successfully");
	}

	@Given("^mobile no to create a new profile$")
	public void mobile_no_to_create_a_new_profile() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@When("^on submit$")
	public void on_submit() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^check for mobile no. is (\\d+) digit long$")
	public void check_for_mobile_no_is_digit_long(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Given("^email to create a new profile$")
	public void email_to_create_a_new_profile() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^check for proper email format$")
	public void check_for_proper_email_format() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Given("^improper values to create a new profile$")
	public void improper_values_to_create_a_new_profile() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^check for mandatory fields and throw error$")
	public void check_for_mandatory_fields_and_throw_error() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Given("^proper values to create a new profile$")
	public void proper_values_to_create_a_new_profile() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^create profile succcessfully$")
	public void create_profile_succcessfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Given("^user is a recruiter and searches for a keyword for which profiles exist$")
	public void user_ia_a_recruiter_and_searches_for_a_keyword_for_which_profiles_exist() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@When("^user clicks on search$")
	public void user_clicks_on_search() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^show job seeker profiles$")
	public void show_job_seeker_profiles() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Given("^user ia a recruiter and searches for a keyword for which profiles do not exist$")
	public void user_ia_a_recruiter_and_searches_for_a_keyword_for_which_profiles_do_not_exist() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^don't show job seeker profiles$")
	public void don_t_show_job_seeker_profiles() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	}

}
