Feature: LoginFeature
  This feature deals with login functionality of the application
  @login
  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the user email address as Email:leon
    And I enter the following for login
      | username | password  |
      | demo     | testdrive |
    And I click login button
    Then I should see the userform page

  Scenario Outline: Login with correct username and password using Scenario outline
    Given I navigate to the login page
    And I enter the <username> and <password>
    And I click login button
    Then I should see the userform page
    Examples:
      | username | password |
      | dadada1  | hahaha1  |
      | dadada2  | hahaha2  |
      | dadada3  | hahaha3  |