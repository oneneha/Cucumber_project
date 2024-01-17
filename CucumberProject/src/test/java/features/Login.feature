@Login
Feature: This Feature will be used to validate login page

  Background: 
    Given I have Launched the application URL
    And I click on Login Link

  @Sanity
  Scenario: Validate login success scenario
    When I enter username
    And I enter password
    And i click on login button
    Then I land on home page

  @WIP
  Scenario: Validate  Login failure login   scenario using data paramters
    When I enter username as "Abc@xyz.com"
    And I enter password as "Abc@1234"
    And i click on login button
    Then I should get the error message as "The email or password you have entered is invalid."

  @WIP
  Scenario Outline: Validate login failure scenario as using  Examples
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    And i click on login button
    Then I should get the error message as "<error_msg>"

    Examples: 
      | UserName    | Password | error_msg                                          |
      | Abc@xyz.com | Abc@1234 | The email or password you have entered is invalid. |
      | Pqr@xyz.com | Pqr@1234 | The email or password you have entered is invalid. |

  @Sanity @Regression
  Scenario: Validate the other login options on the screen
    Then I should see below login options on the screen
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
