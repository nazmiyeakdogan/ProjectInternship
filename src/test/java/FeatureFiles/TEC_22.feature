Feature: Departments Functionality Test

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Departments Add Function
    And Click on the element in the Left Nav
      | setupOne    |
      | schoolSetup |
      | departments |

    And Click on the element in Dialog Content
      | addButton |

    And Sending the keys in Dilaog Content
      | nameInput | 1Math |
      | codeInput | 1M    |

    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed

  Scenario: Departments Edit Function
    And Click on the element in the Left Nav
      | setupOne    |
      | schoolSetup |
      | departments |

    And Click on the element in Dialog Content
      | mathEditButton |

    And Sending the keys in Dilaog Content
      | nameInput | 1MathUpdated |

    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed

  Scenario: Departments Delete Function
    And Click on the element in the Left Nav
      | setupOne    |
      | schoolSetup |
      | departments |

    And Click on the element in Dialog Content
      | mathUpdatedDeleteButton |

    And Click on confirm delete button
      | deleteDialogBtn |

    And Success message should be displayed

