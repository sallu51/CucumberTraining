Feature: Start A Quote

  Scenario: Start A Quote in state Farm Home Page

    Given user is in statefarm home page
    When user select <Product>
    And user enters <zipcode>
    And user clicks on start a quote
    Then <Title> should be displayed

    Example:
      |Product|zipcode|
      |Auto   |50366  |
