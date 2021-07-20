Feature: login to nop commerce
  In order to login to application
  As a valid user
  I should provide valid email and password

  @ui
 Scenario: Verify login with valid credentials
   Given i navigate to url "https://demo.nopcommerce.com/"
   Then  i should be navigated to home page
   When  i click on login link from the navbar
   Then  i should be navigated to login page
   When  i enter email as "Ad1@nop.com"
   And   i enter password as "Qwe@123"
   And   i click on login button
   Then  i should be logged in successfully










