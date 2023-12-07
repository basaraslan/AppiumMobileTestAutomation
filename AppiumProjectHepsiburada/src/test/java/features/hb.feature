Feature:
  Scenario: Login Page Test Scenario

    @Check
    Scenario: Check Login Page Components
      When Click to my account button
      When Click to login button
      Then Check to login button available
      Then Check to e-mail box available


      @FalseEMailAddress
      Scenario Outline: False e-mail address
        When Click to my account button
        When Click to login button
        When Write to email address
        Then Check to "<Error>" message
        Examples:
          |Error                      |
          |Write valid e-mail address.|



