$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/amazon.feature");
formatter.feature({
  "name": "To validate the sign in functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate the invalid username and valid password in amazon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the amazon applcation",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon.toLaunchTheUrlOfTheAmazonApplcation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the invalid emailid or phoneno in username field",
  "rows": [
    {
      "cells": [
        "username1",
        "greens123@gmail.com"
      ]
    },
    {
      "cells": [
        "username2",
        "abc123@gmail.com"
      ]
    },
    {
      "cells": [
        "username3",
        "def456@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toPassTheInvalidEmailidOrPhonenoInUsernameField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toClickTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid password in password field",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "greens123",
        "greens456",
        "greens789"
      ]
    },
    {
      "cells": [
        "abc123",
        "abc456",
        "abc789"
      ]
    },
    {
      "cells": [
        "def123",
        "def456",
        "def789"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toPassTheValidPasswordInPasswordField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/facebook.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate the valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "Login.to_launch_the_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid username in email field",
  "rows": [
    {
      "cells": [
        "abc123@gmail.com",
        "def345@gmail.com",
        "xyz567@gmail.com",
        "rty890@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login.to_pass_the_valid_username_in_email_field(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.Login.to_pass_the_valid_username_in_email_field(Login.java:36)\r\n\tat ✽.To pass the valid username in email field(src/test/resources/facebook.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass the invalid password in password field",
  "rows": [
    {
      "cells": [
        "selenium",
        "Greens@gmail.com",
        "12345678"
      ]
    },
    {
      "cells": [
        "java12@",
        "pythonsel",
        "98765432"
      ]
    },
    {
      "cells": [
        "Java8765",
        "Greens",
        "testing1"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login.to_pass_the_invalid_password_in_password_field(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative testcases in login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Launch the url of the given application",
  "keyword": "When "
});
formatter.step({
  "name": "Pass the positive and negative \"\u003cusername\u003e\" from email field",
  "keyword": "And "
});
formatter.step({
  "name": "Pass the positive and negative \"\u003cpassword\u003e\" from password field",
  "keyword": "And "
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc@gmail.com",
        "abc122"
      ]
    },
    {
      "cells": [
        "def@gmail.com",
        "def66778"
      ]
    },
    {
      "cells": [
        "xyz@gmail.com",
        "xyz56546"
      ]
    },
    {
      "cells": [
        "rty@gmail.com",
        "rty4545"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative testcases in login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the url of the given application",
  "keyword": "When "
});
formatter.match({
  "location": "MulipleDatas.launchTheUrlOfTheGivenApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"abc@gmail.com\" from email field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"abc122\" from password field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative testcases in login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the url of the given application",
  "keyword": "When "
});
formatter.match({
  "location": "MulipleDatas.launchTheUrlOfTheGivenApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"def@gmail.com\" from email field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"def66778\" from password field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative testcases in login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the url of the given application",
  "keyword": "When "
});
formatter.match({
  "location": "MulipleDatas.launchTheUrlOfTheGivenApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"xyz@gmail.com\" from email field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"xyz56546\" from password field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative testcases in login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the url of the given application",
  "keyword": "When "
});
formatter.match({
  "location": "MulipleDatas.launchTheUrlOfTheGivenApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"rty@gmail.com\" from email field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the positive and negative \"rty4545\" from password field",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.passThePositiveAndNegativeFromPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "MulipleDatas.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});