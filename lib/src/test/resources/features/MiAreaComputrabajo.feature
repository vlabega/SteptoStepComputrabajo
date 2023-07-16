  Feature: MiAreaComputrabajo
  As a Web User
  I want to use Computrabajo
  to search for jobs in different companies and countries

  Background: LoginComputrabajo
    Given that the User want do login in the application
    When User enter credentials
      | User               | Password        |
      | vlabega@gmail.com  | LimaPanama2023* |
    Then User should see the oferts country in the screen

  @MiAreaComputrabajo
  Scenario: Open Mi Area
    Given that the User wants to open the Mi Area panel
    When the User navigates to the Mi Area section
    Then the User should see the job search results for a specific CV
    