
@Feature2
Feature: To validate the login functionality

@Smoke
  Scenario: To validate the valid username and invalid password
    When To launch the url of the application
    And To pass the valid username in email field
      #one dimentional list---->without header
      #         0                 1                  2                  3
      | abc123@gmail.com | def345@gmail.com | xyz567@gmail.com | rty890@gmail.com |
    And To pass the invalid password in password field
      #two dimensional list---->without header
      #   0             1               2
      | selenium | Greens@gmail.com | 12345678 |
      | java12@  | pythonsel        | 98765432 |
      | Java8765 | Greens           | testing1 |
    And To click the login button

@Sanity
  Scenario Outline: To validate the positive and negative testcases in login functionality
    When Launch the url of the given application
    And Pass the positive and negative "<username>" from email field
    And Pass the positive and negative "<password>" from password field
    And Click the login button

    Examples: 
      | username      | password |
      | abc@gmail.com | abc122   |
      | def@gmail.com | def66778 |
      | xyz@gmail.com | xyz56546 |
      | rty@gmail.com | rty4545  |
