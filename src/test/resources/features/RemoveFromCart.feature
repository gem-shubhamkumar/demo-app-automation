@demo_app
Feature: Place an order successfully

  @remove_from_cart
  Scenario Outline: To remove item from cart
    Given launch the application and login using "<UserName>" and "<Password>"
    And select catalog option
    And navigate to products page
    When select a product "<Product>"
    And click on Add to Cart
    And click the cart button
    Then verify the cart product
    And click on remove button for "<Product>"
    And verify the empty cart
    And logout the user

    Examples:
      | UserName        | Password | Product           |
      | bob@example.com | 10203040 | Sauce Labs Onesie |