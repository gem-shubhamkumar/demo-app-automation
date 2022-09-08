@demo_app
Feature: Place an order successfully

  @place_an_order
  Scenario Outline: To place an order
    Given launch the application and login using "<UserName>" and "<Password>"
    And select catalog option
    And navigate to products page
    When select a product "<Product>"
    And click on Add to Cart
    And click the cart button
    Then verify the cart product
    And click on proceed to checkout
    And fill the shipping address with "<FullName>" "<AddressL1>" "<AddressL2>" "<City>" "<State>" "<Zipcode>" "<Country>"
    And click on to payment button
    And fill the payment details with "<CardHolderName>" "<CardNumber>" "<ExpDate>" "<CVV>"
    And click on review button
    And verify the review page
    And click on place order button
    And verify the confirm message
    And logout the user

    Examples:
      | UserName        | Password | Product           | FullName | AddressL1                   | AddressL2 | City       | State | Zipcode | Country     | CardHolderName | CardNumber      | ExpDate | CVV |
      | bob@example.com | 10203040 | Sauce Labs Onesie | John Doe | 2134 MONTEBELLO TOWN CENTER | SPACE K8  | MONTEBELLO | CA    | 90640   | LOS ANGELES | Rebecca Winter | 325812657568789 | 0325    | 123 |