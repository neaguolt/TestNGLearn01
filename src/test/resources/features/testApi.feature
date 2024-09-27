Feature: Test rahuls API

  As a backend developer
  I want to test CRUD operation of rahuls API
  So that I can ensure the API works fine
  Scenario: Validate the fixed city name from the weather API
    Given the user  has weather API address available
    When the user fetch the weather data
    Then the city name should be "Vienna"