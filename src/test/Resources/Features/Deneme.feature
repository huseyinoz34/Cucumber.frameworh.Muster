Feature: Amazon_search

  Scenario: Gehen amazon ein und ein paar waren suchen
    Given Gehen auf Amazon homepage ein
    And  suchen iPhone
    Then beweisen dass die result iPhone enthalt