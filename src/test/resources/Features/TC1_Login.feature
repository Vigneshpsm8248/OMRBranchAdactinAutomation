@Login
Feature: verifying Adactin Hotal login details

  Scenario Outline: verifying Adactin Hotel login Valid credentials
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"

    Examples: 
      | username    | password   |
      | Vickyinpavi | 7397194873 |

  Scenario Outline: verifying Adactin Hotel login using Enter
    Given User is on the Adactin page
    When User should perform login "<username>","<password>" with Enterkey
    Then User should verify after login success message "Hello vickyinpavi!"

    Examples: 
      | username    | password   |
      | Vickyinpavi | 7397194873 |

  Scenario Outline: verifying Adactin Hotel login InValid credentials
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login with invalid credential error message "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | username  | password  |
      | VickyAmds | GT5467TYL |
