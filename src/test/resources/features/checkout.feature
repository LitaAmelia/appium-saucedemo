@checkout
Feature: User Checkout Product

  Background:
    Given the app is launched
    And User logged into SauceDemo

    Scenario: User successful checkout product
      When User add product "Sauce Labs Backpack" to cart
      And User add product "Sauce Labs Bike Light" to cart
      And User click cart icon
      Then User should be redirected to the Cart page
      Then User should see products in cart
          |Sauce Labs Backpack|
          |Sauce Labs Bike Light|

      When User click checkout button
      And User input first name "Bunga"
      And User input last name "Liliput"
      And User input postal code "23456"
      And User click continue button
      Then User should be redirected to the Checkout Overview page

      When User click finish button
      Then User see checkout complete message "THANK YOU FOR YOU ORDER"