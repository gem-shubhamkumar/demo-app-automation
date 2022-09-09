@demo_app
Feature: Place an order successfully

  @fail_scenario
  Scenario Outline: To fail the scenario
    Given launch the application and login using "<UserName>" and "<Password>"
    And select catalog option
    And navigate to products page
    When select a product "<Product>"
    Then fail to verify the title
    And logout the user

    Examples:
      | UserName        | Password | Product           |
      | bob@example.com | 10203040 | Sauce Labs Onesie |