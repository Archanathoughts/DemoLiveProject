package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*
;

public class Register {
	@Given("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
		Base.driver.get(Base.reader.getUrl());	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)  {
	    //
	}

	@When("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() {
	   	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button(){
	   
	}

	@And("^I should see that the user account has successfully created$")
	public void i_should_see_that_the_user_account_has_successfully_created() throws Throwable {
	   	}



}
