Feature: ZadanieZaliczeniowe1

  Scenario: user want to add new address
    When user goes to their account
    Then user add new address with Zlatan, Abrakadabra, Moskow, 78-200, 666666666 and delete them

  Scenario Outline: user want to add many addresses
    When user goes to their account
    Then user add new address with <alias>, <address>, <city>, <postalcode>, <phonenumber> and delete them

    Examples:
      | alias | address     | city     | postalcode | phonenumber |
      | Obama | Wall Street | New York | 66678      | 123456789   |