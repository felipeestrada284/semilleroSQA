Feature: Trivago website

  the user wishes to make a reservation for a flight or a hotel
  to travel to their destination on the trivago page where they
  will find different prices and places to stay


  @regression
  Scenario: the user wants to make a reservation
    Given the user enters the trivago page
    When he will make a reservation on the page for a round trip flight
    Then he must validate that the reservation was made correctly with the data entered