Feature: MiAreaComputrabajo
  As a Web User
  I want to use Computrabajo
  to search for jobs in different companies and countries

  Background: LoginComputrabajo
    Given that the User want do login in the application
    When User enter credentials
      | User              | Password        |
      | vlabega@gmail.com | LimaPanama2023* |
    Then User should see the oferts country in the screen

  @BuscarEmpleo
  Scenario: find Job
    Given that the User wants to find a new job
    When the User writes the search term
    Then the User should see the job search results
