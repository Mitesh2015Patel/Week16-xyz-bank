@regression
Feature: Bank Manager
  As User, I want to add and open customer account

  Background: I should access customer account
    Given     I should click on 'Bank Manager Login' Tab

    @smoke
    Scenario: I should add Customer Successfully
      When    I should click on Add Customer tab
      And     I should enter first name "Mansi"
      And     I should enter last name "patel"
      And     I should enter postcode "nn8 1th"
      Then    I click on 'Add Customer' Button
      And     I should verify message 'customer added successfully'
      Then    I click 'ok' on popup

      @sanity
      Scenario: I should open Account successfully
        When    I should click on Open Account Tab
        And     I should search customer that created in first test "Harry Potter"
        And     I Should select currency 'pound'
        And     I click on 'process' button
        Then    I should verify message 'Account created successfully'
        And     I click on 'ok' button on popup

