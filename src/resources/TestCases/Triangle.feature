Feature: Triangle

  Background:
    Given user is on 'https://www.vanilton.net/triangulo/' url
    And all fields are clear

  Scenario: Check triangle does not exists
    When insert the value "1" on "Vértice 1:" field
    And insert the value "2" on "Vértice 2:" field
    And insert the value "5" on "Vértice 3:" field
    And click on "Identificar" button
    Then an error message should be displayed on the screen
    And all fields are clear

  Scenario: Check equilateral triangle
    When insert the value "3" on "Vértice 1:" field
    And insert the value "3" on "Vértice 2:" field
    And insert the value "3" on "Vértice 3:" field
    And click on "Identificar" button
    Then the values inserted should be displayed in separated lines
    And an equilateral triangle draw should be displayed
    And the text "Equilátero" should be displayed below draw
    And all fields are clear

  Scenario: Check isosceles triangle
    When insert the value "3" on "Vértice 1:" field
    And insert the value "4" on "Vértice 2:" field
    And insert the value "4" on "Vértice 3:" field
    And click on "Identificar" button
    Then the values inserted should be displayed in separated lines
    And an isosceles triangle draw should be displayed
    And the text "Isósceles" should be displayed below draw

  Scenario: Check scalene triangle
    When insert the value "3" on "Vértice 1:" field
    And insert the value "4" on "Vértice 2:" field
    And insert the value "5" on "Vértice 3:" field
    And click on "Identificar" button
    Then the values inserted should be displayed in separated lines
    And a scalene triangle draw should be displayed
    And the text "Escaleno" should be displayed below draw