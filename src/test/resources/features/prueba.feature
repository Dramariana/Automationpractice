Feature: Buy a Dress

  Scenario Outline: I verify that dress are in shopping cart of automationpractice
    Given I am in the automationpractice site
    And I click on login button
    When I add the dress the shopping cart
    Then I verify that dress are in shopping cart
      | <Product>            | <Quantity> |

      Examples: 
      | Product    | Quantity |
      | Printed Summer Dress |        1 |