
Feature: API Testing with Rest Assured Java

  Scenario: Verify GET request to a specific endpoint
    Given I set base URI as "https://httpbin.org"
    When I send a GET request to "/cookies"
    Then I receive status code 200