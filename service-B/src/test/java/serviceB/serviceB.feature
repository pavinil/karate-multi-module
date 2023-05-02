Feature: Feature file for testing service B

  Scenario: Ping service B
    Given url 'https://jsonplaceholder.typicode.com/todos/1'
    When method Get
    Then status 200
