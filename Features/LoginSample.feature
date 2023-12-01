Feature: Login to System

  #Ctl+shift+F -- alignment/pretty format
  @sanity
  Scenario: Login with valid credentials
    Given User Launch the URL "https://www.swiggy.com/"
    When click SignIn button
    And click on create an account link
    Then User should navigate to Sign Up page

  @regression
  Scenario: Login with invalid credentials
    Given User Launch the browser
    When User enters username as "standard_user" and password as "secret_sauce"
    And click on Login button
    Then User navigate to My Account page
