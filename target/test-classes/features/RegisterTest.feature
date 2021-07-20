Feature: Register new user


  Background: navigate to url and click on register link
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to home page
    When  i click on register link from the navbar
    Then  i should be navigated to register page

Scenario: Verify new user registration by providing data in all mandatory fields


  When  i select the gender as male
  And   i enter firstName lastName email password confirmPassword
  | firstName | lastName | email          | password    | confirmPassword |
  |  user     | qa       | Ad!tya@nop.com | QWE@123     | QWE@123         |
  And i click on register button
  Then i should be registered successfully


  @sanity
 Scenario: Verify error messages when data is not provided in mandatory fields

   When  i click on register button
   Then  i should see error messages for all the mandatory fields







