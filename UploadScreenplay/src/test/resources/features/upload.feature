Feature: upload

  @regression
  Scenario: upload file
    Given practice upload file
    When upload the file in page
    Then see the uploaded file