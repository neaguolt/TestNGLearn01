Feature: Test rahuls API

  As a backend developer
  I want to test CRUD operation of rahuls API
  So that I can ensure the API works fine
  Scenario: Validate the user can send new data to API
    Given the user has address for sending data to API
    When the user sends new data to API
    Then the response should be ok from API