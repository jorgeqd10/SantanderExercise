Feature: smoke testing
  Scenario: Validate use case 015
    Given I am opening santander page
    Then I clicking get started button from checking accounts
    Then I verify checking account options
    And I click open account for simply right checking
    Then I verify web title "https://secureopen.santanderbank.com/apps/servlet/SmartForm.html?formCode=sbnadao&product=SimplyRightChecking"

  Scenario: Validate use case 010
    Given I am opening santander page
    Then I click find the branch button
    Then I enter "07733" zipcode and search
    And I verify "20" branch boxes are displayed
    Then I enter "00000" zipcode and search
    And I verify "0" branch boxes are displayed
