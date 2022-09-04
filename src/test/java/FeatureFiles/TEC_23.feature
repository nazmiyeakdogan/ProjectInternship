Feature:  Bank Accounts Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Bank Accounts
    And Click on the element in the Left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

    And Click on the element in Dialog Content
      | addBankAccounts |

    And Sending the keys in Dilaog Content
      | bankAccountsName | Efe Kaya                |
      | Iban             | EUR00 1111 2222 3333 44 |
      | IntegrationCode  | 978                     |


    And Click on the element in Dialog Content
      | currency    |
      | currencyEUR |
      | saveButton  |

    And Success message should be displayed

    Scenario: Edit Bank Accounts

      And Click on the element in the Left Nav
        | setupOne     |
        | parameters   |
        | bankAccounts |

      And Click on the element in Dialog Content
        | addBankAccounts |


