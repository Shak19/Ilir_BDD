#Sample feature file for Behavior-Driven Testing and Development training
#Author: Fernanda Menks - fernanda.menks@accenture.com
#Creation date: July 31, 2016
Feature: Manage simple transactions in a banking account
         In order to manage my money more efficiently
         As a bank client
         TC_001: I want to make a deposit and withdraw money whenever I need to
         TC_002: I want to make a transfer to another bank account whenever I need to
         TC_003: I want to make a transfer to an international bank account

  #Login information for generic user so all scenarios will use the same starting point
  Background: 
    Given a user access the bank web app
    And logs using the credentials
      | bank_id | username | password | url                       |
      |   25967 | banker   | training | http://www.mykidsbank.org |

  @TC_001 @in_progress
  Scenario: Make a deposit
    Given my checking account has balance equal or greater than zero
    When I deposit 1500 to my checking account
    Then I should have additional 1500 as balance

  # Include here the parametrization and data for positive and negative test
  
  
  @TC002 @signed-off
  Scenario Outline: Make a withdraw
    Given my checking account has a balance greater than <withdrawn_amount> before withdraw
    When I withdraw <withdrawn_amount> from my checking account
    Then I should have less <withdrawn_amount> as balance

    Examples: 
      | withdrawn_amount |
      |              250 |
      |             1000 |
