
Feature: Check RestAssured Get API

  Scenario: Verify one title of the post
    Given Api is running for "https://jsonplaceholder.typicode.com/posts"
    And I perform GET method for the user id "2"
    Then I should see the title as "qui est esse"
    And Status code Should be 200
    
    
 