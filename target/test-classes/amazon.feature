@Feature1
Feature: To validate the sign in functionality

@Regression
  Scenario: To validate the invalid username and valid password in amazon
    When To launch the url of the amazon applcation
    And To pass the invalid emailid or phoneno in username field
      #one dimensional map---->with header
      #  key           value
      | username1 | greens123@gmail.com |
      | username2 | abc123@gmail.com    |
      | username3 | def456@gmail.com    |
    And To click the continue button
    And To pass the valid password in password field
      #two dimentional map
      #  key1         key2        key3
      | password1 | password2 | password3 |
      | greens123 | greens456 | greens789 |
      | abc123    | abc456    | abc789    |
      | def123    | def456    | def789    |
    And To click the sign in button
