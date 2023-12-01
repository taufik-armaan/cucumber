Feature: Login to the application

  #Ctl+shift+F -- alignment/pretty format
  @sanity
  Scenario: Successfull Login with valid credentials
    Given User Launch browser
    And Open URL "https://rahulshettyacademy.com/client/auth/login"
    When click on Login
    When User enters Email as "mtohfiksattar@gmail.com" and password as "Armaan@123"
    And click on Login button
    Then User navigate to My Account page
