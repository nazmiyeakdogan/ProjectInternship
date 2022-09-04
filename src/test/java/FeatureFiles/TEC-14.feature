Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: User Add Position Category
    And Click on the element in the Left Nav
      | humanResources        |
      | humanResourcesSetup   |
      | positionCategories    |

    And Click on the element in Dialog Content
      | addButton |

    And Sending the keys in Dilaog Content
      | nameInput | Grup18     |

    And Click on the element in Dialog Content
      | saveButton    |

    And Success message should be displayed

  Scenario: User Edit Position Category

    And Click on the element in the Left Nav
      | humanResources        |
      | humanResourcesSetup   |
      | positionCategories    |

    And Sending the keys in Dilaog Content
      | searchInput | Grup18     |

    And Click on the element in Dialog Content
      | searchButton |

    And Click on the element in Dialog Content
      | editButton |

    And Sending the keys in Dilaog Content
      | nameInput | Grup18_New     |

    And Click on the element in Dialog Content
      | saveButton    |

    And Success message should be displayed

  Scenario:  User delete positon category

    And Click on the element in the Left Nav
      | humanResources        |
      | humanResourcesSetup   |
      | positionCategories    |

    And User delete item from dialog
      | Grup18_New     |

    And Success message should be displayed


