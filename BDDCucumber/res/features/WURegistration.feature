Feature: WU Registration Feature

@Regression
  Scenario Outline: Verify WU Registration Form
    Given User lunch the browser
    When User enter the WU Registaration url
    Then verify user is landed on WU Registaration Page
    And User enter first name as <firstName> in the field
    And User enter middle name as <middleName> in the field
    And User enter last name as <lastName> in the field

    Examples: 
      | firstName | middleName | lastName |
      | Anil      | Kumar      | Reddy    |
      | Sunil     | Kumar      | Gowda    |
