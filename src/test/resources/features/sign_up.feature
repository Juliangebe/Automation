Feature:
  Scenario: Client sign up sucessfully
    Given The client wants to have an account
    When He send required information to get the account
    Then He should be told that the account was created

  Scenario: Client sign up failed
    Given The client wants to have an account
    When He send required information to get the account
    Then He should be told that the account was not created


