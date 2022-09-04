Feature: Document Types Functionality

Background:
Given Navigate to basqar
When Enter username and password and click login button
Then User should login successfully

  Scenario: Create Document Type
    And Click on the element in the Left Nav
    |setupOne      |
    |parameters    |
    |documentTypes |

    And Click on the element in Dialog Content
    ||