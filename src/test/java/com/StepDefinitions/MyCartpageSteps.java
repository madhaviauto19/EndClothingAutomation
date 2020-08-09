package com.StepDefinitions;

import PageObjects.HomePage;
import UtilityMethods.ApplicationMethods;
import UtilityMethods.Report;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyCartpageSteps {
	
	ApplicationMethods AppMethods = new ApplicationMethods();
	Report Reporter = new Report();
	//Pages
	HomePage ObjHomePage = new HomePage();
	

	

@Given("^I am a UK customer$")
public void i_am_a_UK_customer() throws Throwable {

	Reporter.reportInitiate();
	AppMethods.appLaunch();
	Reporter.reportCreator("Validate black shirts product count");


}

@Given("^navigated to the shirts sub category in Clothing category$")
public void navigated_to_the_shirts_sub_category_in_Clothing_category() throws Throwable {
	AppMethods.ClickClothings();
	Reporter.LogStepPass("Selected clothing category");
	AppMethods.SelectShirts();
	Reporter.LogStepPass("Selected shirts");
}

@When("^I filter black in color section$")
public void i_filter_black_in_color_section() throws Throwable {
	AppMethods.SelectBlack();
	Reporter.LogStepPass("Selected colour black");
}

@Then("^I should see some black shirts$")
public void i_should_see_some_black_shirts() throws Throwable {
	if(AppMethods.CheckProductsColor()) {
		Reporter.LogStepPass("Checked the colour of the products, all shirts were black");
	}else {
		Reporter.LogStepFail("Color filter is not working");
		}
	

}

@Then("^Verify filter is present and print product count in the report\\.$")
public void verify_filter_is_present_and_print_product_count_in_the_report() throws Throwable {
	
	AppMethods.Validatefilters();
	
	int PrdCnt = AppMethods.GetProductsCount();
	System.out.println("Items count is "+PrdCnt);
	Reporter.LogStepPass("total product count displaying "+PrdCnt);
	AppMethods.CloseApplication();
	

}


@Given("^I search for shirts$")
public void i_search_for_shirts() throws Throwable {
	AppMethods.appLaunch();
	Reporter.reportCreator("Validating MyCart Page");
	AppMethods.ClickSearchButton();
	Reporter.LogStepPass("Searching for shirts");
	AppMethods.EnterSearchInput("Shirts");
	AppMethods.ClickViewAll();
	Reporter.LogStepPass("Click on view all link to navigate to product listing page");
}

@Given("^click on any product on the product listing page$")
public void click_on_any_product_on_the_product_listing_page() throws Throwable {
	AppMethods.ClickFirstproduct();
	Reporter.LogStepPass("Selecting a Product from the product listing page");
}

@Given("^I select any product size$")
public void i_select_any_product_size() throws Throwable {
	AppMethods.ClickSmallSize();
	Reporter.LogStepPass("Selected size '`Small'`of the Product");
}

@Given("^click on ADD TO CART button$")
public void click_on_ADD_TO_CART_button() throws Throwable {
	AppMethods.ClickAddtoCart();
	Reporter.LogStepPass("click on ADD TO CART button");
}

@Given("^I go back to the Product detail page$")
public void i_go_back_to_the_Product_detail_page() throws Throwable {
	AppMethods.BackToProductPage();
}

@Given("^I select another different product size$")
public void i_select_another_different_product_size() throws Throwable {
	AppMethods.ClickLargeSize();
	Reporter.LogStepPass("I select another different product size");
}

@When("^I click on ADD TO CART button$")
public void i_click_on_ADD_TO_CART_button() throws Throwable {
	AppMethods.ClickAddtoCart();
	Reporter.LogStepPass("I click on ADD TO CART button");
}

@Then("^I should see two products in the cart\\.$")
public void i_should_see_two_products_in_the_cart() throws Throwable {
	int cnt = AppMethods.NoOfProductsInCart();
	if(cnt==2) {
		Reporter.LogStepInfo("Two products were present in my cart page");
	}else {
		Reporter.LogStepInfo("Two products were not present in my cart page");
		Reporter.LogStepFail("Product missing in my cart page");
	}
	Reporter.LogStepPass("I should see two products in the cart");
}

@Then("^cart total should be correct$")
public void cart_total_should_be_correct() throws Throwable {
int totalprice = AppMethods.GetTotalCartValue();

int SumOftwoProducts = AppMethods.GetsumofTwoProducts();

Reporter.LogStepInfo("Sum of added products price is - "+SumOftwoProducts);
Reporter.LogStepInfo("Total value of added products displaying in my cart page - "+totalprice);
System.out.println("total price - "+totalprice);
System.out.println("sum of two prices price - "+SumOftwoProducts);
Reporter.LogStepPass("Cart total is correct");
AppMethods.CloseApplication();
Reporter.ReportEnd();
}
	

}
