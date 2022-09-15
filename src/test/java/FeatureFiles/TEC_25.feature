Feature:   Discounts Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:  User Discounts
    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    And Click on the element in Dialog Content
      | addButton |

    And Sending the keys in Dilaog Content
      | nameInputdiscount | grup18Pelin |
      | codeEdit          | 0034        |
      | priority          | 02          |


    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed


  Scenario: User Edit Discounts




    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | discounts  |




    And Sending the keys in Dilaog Content
      | description | grup18Pelin |



    And Click on the element in Dialog Content
      | searchButton |

    And Click on the element in Dialog Content
      | editButton |

    And Sending the keys in Dilaog Content
      | nameInputdiscount | grup18PelinCimen |


    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed


  Scenario:  User delete  Discounts
    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | discounts  |


    And User delete item from Dialog Content
      | grup18PelinCimen |

    And Success message should be displayed









