package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.SearchPage;

import cucumber.api.java.en.*;


public class Search {
	SearchPage searchPage=new SearchPage();
	HeaderSection headerSection=new HeaderSection();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product)  {
		Elements.TypeText(HeaderSection.searchTextbox, product);
		Elements.click(HeaderSection.searchButton);
	 
	}

	@Then("^I should see the product in the search resultsil address$")
	public void i_should_see_the_product_in_the_search_resultsil_address(){
	  Assert.assertTrue(Elements.isDisplayed(SearchPage.samsungSyncMasterSearchResult));
	}



}