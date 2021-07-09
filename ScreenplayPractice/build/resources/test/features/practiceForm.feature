Feature: Practice forms

  @regression
  Scenario: Student registration form
    Given the student wants to practice forms on the demoqa page
    When He must fill in all the fields of the form
    Then He should see the form with the data entered with faker

  @smokeTest
  Scenario: Student registration form with excel data
    Given the student wants to practice forms on the demoqa page
    When He must fill in all the fields of the form with the excel data
    Then He should see the form with the data entered with excel

  @studentRegister
  Scenario: Student registration form with setting properties
    Given the student wants to practice forms on the demoqa page
    When He must fill in all the fields of the form with setting properties
    Then He should see the form with the data entered