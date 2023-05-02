Feature: Feature file for testing service A

  Scenario: Ping service A
    Given url 'https://jsonplaceholder.typicode.com/todos/1'
    When method Get
    Then status 200
