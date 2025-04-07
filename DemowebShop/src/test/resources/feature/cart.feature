Feature: add to cart the products in the Application
 
 @Checkouttheproductvalid
  Scenario: verify the product is added to cart by search field store
  
  Given I am on the demowebshop application 
  When I click the search store field 
  And enter the product name
  And click add to cart button
  Then User should see the product in the wishlist