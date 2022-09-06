Feature: Fields Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Fields

    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And Click on the element in Dialog Content
      | addButton |


    And Sending the keys in Dilaog Content
      | nameInput | Hasan Ebrar |
      | codeInput | blablabla   |


    And Click on the element in Dialog Content
#      | fieldType  |
#      | intOptn    |
      | saveButton |

    And Success message should be displayed

  Scenario: Edit Fields

    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And Sending the keys in Dilaog Content
      | searchName | Hasan Ebrar |

    And Click on the element in Dialog Content
      | searchButton |

    And Click on the element in Dialog Content
      | editButton |

    And Click on the element in Dialog Content
      | nameInput | Hasan Alarcin |

    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed

  Scenario: Delete Fields

    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And User delete item from Dialog Content
      | Hasan Alarcin |

    And Success message should be displayed