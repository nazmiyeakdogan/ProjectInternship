Feature: Human Resources Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Positions
    And Click on the element in the Left Nav
      | humanResources      |
      | humanResourcesSetup |
      | positions  |
    And Click on the element in Dialog Content
      | addButton |
    And Sending the keys in Dilaog Content
      | nameInput | Grup18Gaffar |
      | shortName | Gr18Gffr     |
    And Click on the element in Dialog Content
      | saveButton    |
    And Success message should be displayed

  Scenario: Edit Positions
    And Click on the element in the Left Nav
      | humanResources      |
      | humanResourcesSetup |
      | positions  |
    And Sending the keys in Dilaog Content
      | searchInput | Grup18Gaffar     |
    And Click on the element in Dialog Content
      | searchButton |
    And Click on the element in Dialog Content
      | editButton |
    And Sending the keys in Dilaog Content
      | nameInput | Grup18Gaffar_New |
      | shortName | Gr18Gffr_New     |
    And Click on the element in Dialog Content
      | saveButton    |
    And Success message should be displayed

  Scenario: Delete Positions
    And Click on the element in the Left Nav
      | humanResources      |
      | humanResourcesSetup |
      | positions  |
    And User delete item from Dialog Content
      | Grup18Gaffar_New |
    And Success message should be displayed