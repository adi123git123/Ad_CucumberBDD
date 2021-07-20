Feature: Register new user

  @sanity  @smoke @new
Scenario: Verify new user registartion by providing data in all mandatory fields
  Given i navigate to url "https://demo.nopcommerce.com/"
  Then  i should be navigated to home page
  When  i click on register link from the navbar
  Then  i should be navigated to register page
  When  i select the gender as female
  And   i enter firstName lastName email password confirmPassword
  | firstName | lastName | email        | password   | confirmPassword|
  |  user     | qa       | user4@nop.com| Testing@123| Testing@123|
  And i click on register button
  Then i should be registered successfully



