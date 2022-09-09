Feature: Grade Levels Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create new grade level

    And Click on the element in the Left Nav
      | setupOne       |
      | parameters     |
      | getGradeLevels |

    And Click on the element in Dialog Content
      | addButton |

    And Sending the keys in Dilaog Content
      | nameInput | Efecan |
      | shortName | Efe    |
      | order     | 11     |

    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed

  Scenario: Edit new grade level

    And Click on the element in the Left Nav
      | setupOne       |
      | parameters     |
      | getGradeLevels |

    And Click on the element in Dialog Content
      | editButtonOption |

    And Sending the keys in Dilaog Content
      | nameInput | Efe Han |

    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed

  Scenario: Delete new grade level

    And Click on the element in the Left Nav
      | setupOne       |
      | parameters     |
      | getGradeLevels |

    And Click on the element in Dialog Content
      | deleteButtonOption |
      | delete             |


    And Success message should be displayed

