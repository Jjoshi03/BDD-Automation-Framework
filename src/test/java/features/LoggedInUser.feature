Feature: LoggedIn User View
  Scenario: Validate user is able to view after logging in
    Given User navigates to the Login page
    When User successfully enters then log in details
    Then User should be able to view the product category page