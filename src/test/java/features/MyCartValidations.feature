Feature: MyCart Validations
Description: In this Feature we will validate 


Scenario: Validate black shirts product count

Given I am a UK customer
And navigated to the shirts sub category in Clothing category
When I filter black in color section
Then I should see some black shirts
And Verify filter is present and print product count in the report.



Scenario: Search for shirts and add a product and with two different size to the cart and ensure cart total matches.

Given I search for shirts
And click on any product on the product listing page
And I select any product size
And click on ADD TO CART button
And I go back to the Product detail page
And I select another different product size
When I click on ADD TO CART button
Then I should see two products in the cart.
And cart total should be correct