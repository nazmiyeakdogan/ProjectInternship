Feature:   Nationalities Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:  User Nationalities
    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | nationalities  |

    And Click on the element in Dialog Content
      | addButton |

    And Sending the keys in Dilaog Content
      |nameInput | grup18Pelin |


    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed




  Scenario: User Edit Nationalities


    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | nationalities  |




    And Sending the keys in Dilaog Content
      | nameInputNationalities | grup18Pelin |



    And Click on the element in Dialog Content
      | searchButton |

    And Click on the element in Dialog Content
      | editButton |

    And Sending the keys in Dilaog Content
      | nameInput | grup18PelinCimen |


    And Click on the element in Dialog Content
      | saveButton |

    And Success message should be displayed


  Scenario:  User delete  Nationalities
    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | nationalities  |


    And User delete item from Dialog Content
      | grup18PelinCimen |

    And Success message should be displayed









