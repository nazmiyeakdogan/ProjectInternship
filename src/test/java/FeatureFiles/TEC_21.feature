Feature: Departments Functionality Test

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: School Locations Add Function
    And Click on the element in the Left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in Dialog Content
      | addButton |

    And Sending the keys in Dilaog Content
      | nameInput              | MuzRepublic |
      | shortName              | MR          |
      | schoolLocationCapacity | 80          |

    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed

  Scenario: School Locations Edit Function
    And Click on the element in the Left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in Dialog Content
      | muzRepublicEditButton |

    And Sending the keys in Dilaog Content
      | nameInput              | BananaRepublic |
      | shortName              | BR             |
      | schoolLocationCapacity | 90             |

    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed

  Scenario: School Locations Delete Function
    And Click on the element in the Left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in Dialog Content
      | bananaRepublicDeleteButton |
      | deleteDialogBtn            |

    And Success message should be displayed

