$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/madhavi/eclipse-workspace/EndClothingAutomation/src/test/java/features/MyCartValidations.feature");
formatter.feature({
  "line": 1,
  "name": "MyCart Validations",
  "description": "Description: In this Feature we will validate",
  "id": "mycart-validations",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate black shirts product count",
  "description": "",
  "id": "mycart-validations;validate-black-shirts-product-count",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am a US customer",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "navigated to the shirts sub category in Clothing category",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter black in color section",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see some black shirts",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify filter is present and print product count in the report.",
  "keyword": "And "
});
formatter.match({
  "location": "MyCartpageSteps.i_am_a_US_customer()"
});
formatter.result({
  "duration": 13733239100,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.navigated_to_the_shirts_sub_category_in_Clothing_category()"
});
formatter.result({
  "duration": 10559604000,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.i_filter_black_in_color_section()"
});
formatter.result({
  "duration": 2529727000,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.i_should_see_some_black_shirts()"
});
formatter.result({
  "duration": 1681087900,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.verify_filter_is_present_and_print_product_count_in_the_report()"
});
formatter.result({
  "duration": 6670703900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search for shirts and add a product and with two different size to the cart and ensure cart total matches.",
  "description": "",
  "id": "mycart-validations;search-for-shirts-and-add-a-product-and-with-two-different-size-to-the-cart-and-ensure-cart-total-matches.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I search for shirts",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "click on any product on the product listing page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select any product size",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on ADD TO CART button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I go back to the Product detail page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select another different product size",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on ADD TO CART button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should see two products in the cart.",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "cart total should be correct",
  "keyword": "And "
});
formatter.match({
  "location": "MyCartpageSteps.i_search_for_shirts()"
});
formatter.result({
  "duration": 18800066300,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.click_on_any_product_on_the_product_listing_page()"
});
formatter.result({
  "duration": 6942087700,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.i_select_any_product_size()"
});
formatter.result({
  "duration": 3241996700,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.click_on_ADD_TO_CART_button()"
});
formatter.result({
  "duration": 7883804600,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.i_go_back_to_the_Product_detail_page()"
});
formatter.result({
  "duration": 445025800,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.i_select_another_different_product_size()"
});
formatter.result({
  "duration": 122209800,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.i_click_on_ADD_TO_CART_button()"
});
formatter.result({
  "duration": 4675862700,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.i_should_see_two_products_in_the_cart()"
});
formatter.result({
  "duration": 63176600,
  "status": "passed"
});
formatter.match({
  "location": "MyCartpageSteps.cart_total_should_be_correct()"
});
formatter.result({
  "duration": 7018315600,
  "status": "passed"
});
});