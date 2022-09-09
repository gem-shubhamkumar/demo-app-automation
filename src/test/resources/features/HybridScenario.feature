@demo_app
Feature: WebView Testing

  @webview
  Scenario Outline: To test web-view functionalities
    Given launch the application and login using "<UserName>" and "<Password>"
    And select webview option
    When enter the "<searchURL>" to search
    And click on go to site button
    Then verify the page title
    And navigate to another "<navigateURL>"
    And verify the page title
    And perform navigate back
    And verify the page title
    And perform the navigate forward
    And verify the page title
    And perform refresh
    And verify the page title
    And press back button and switch to native app
    And logout the user

    Examples:
      | UserName        | Password | searchURL | navigateURL |
      | bob@example.com | 10203040 | GITHUB    | GFG         |