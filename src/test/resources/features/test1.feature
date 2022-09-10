Feature: login to the application verification

  @test1
  Scenario: login verification
    Given the user login to the application
    Then the home page title displayed as "ParaBank | Accounts Overview"