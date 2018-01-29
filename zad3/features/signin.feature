@Login
Feature:

  Scenario : Successful log in from application
    Given I  on start page
    When I click “Sign in” button
    And I enter the email address as "agata@op.pl" and password as "agata"
    And I click button ,,Sign in"
    And I click button ,,My personal information"
    And Information is correct
    Then Login is successful

  Scenario Outline: Log in from application with incorrect password
    Given I  on start page
    When I click “Sign in” button
    And I enter the login as "<login>" and password as "<password>"
    And I click button ,,Sign in"
    Then Error message "Authentication failed." is displayed

    Examples:
      | login          | password |
      | Agata@email.pl | 123447   |
      | Joe@email.pl   | qwertu   |


  Scenario Outline: Log in from application with non-existent login
    Given I  on start page
    When I click “Sign in” button
    And I enter the login as "<login>" and password as "<password>"
    And I click button ,,Sign in"
    Then Error message "Authentication failed." is displayed

    Examples:
      | login            | password |
      | Agata12@email.pl | 123456   |
      | Joe12@email.pl   | qwerty   |

  Scenario Outline: Log in from application with bad email
    Given I  on start page
    When I click “Sign in” button
    And I enter the login as "<login>" and password as "<password>"
    And I click button ,,Sign in"
    Then Error message "Invalid email address." is displayed

    Examples:
      | login            | password |
      | Agata12email.pl | 123456   |
      | Joe12email.pl   | qwerty   |



