Feature: LoginComputrabajo
  As a Web User  
  I want to use Computrabajo
  to search job in different companies

  @LoginComputrabajo
  Scenario: LoginComputrabajo
    Given that the User want do login in the application
    When User enter credentials
      | User               | Password        |
      | vlabega@gmail.com  | LimaPanama2023* |
    Then User should see the oferts country in the screen