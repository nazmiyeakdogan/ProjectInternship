Feature:  Bank Accounts Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Bank Account
    And Click on the element in the Left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

    And Click on the element in Dialog Content
      | addButton |

    And Sending the keys in Dilaog Content
      | nameInput       | Efe Kaya                |
      | Iban            | EUR00 1111 2222 3333 44 |
      | IntegrationCode | 978                     |


    And Click on the element in Dialog Content
      | currency    |
      | currencyEUR |
      | saveButton  |

    And Success message should be displayed

  Scenario: Edit Bank Account
    And Click on the element in the Left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

    And Sending the keys in Dilaog Content
      | searchInput | Efe Kaya |

    And Click on the element in Dialog Content
      | searchButton |

    And Click on the element in Dialog Content
      | editButton |

    And Sending the keys in Dilaog Content
      | nameInput | Elif Kaya |

    And Click on the element in Dialog Content
      | saveButton  |

    And Success message should be displayed

  Scenario: Delete Bank Account

    And Click on the element in the Left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

    And User delete item from Dialog Content
      | Elif Kaya |

    And Success message should be displayed







