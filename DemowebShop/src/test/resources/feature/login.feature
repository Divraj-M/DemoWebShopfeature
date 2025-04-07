Feature: Automate the Login page of demowebshop application 
  
  Background:
  Given I am on the DemoWebShop website
  
  @ValidCredentialsLoggedIn
  Scenario: Login to the DemoWebShop Application
  When I click Login and enter valid email and valid password
  |abcggggg123@Gmail.com|Divraj@1234|
  Then user should be entered in the Homepage of the Application
  

  
  @InvalidCredentialsLoggedIn
  Scenario: Login to the DemoWebShop Application
  When I click Login and enter invalid email and invalid password
  | gg@com| helo|
  Then user should see the error message in the Application