@SearchHotel
Feature: verifying Adactin Hotel SearchHotel details

  Scenario Outline: verifying Adactin Hotel login and enter SearchHotel Valid credentials
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should enter allfields in SearchHotel "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childperroom>"
    Then User should need to verify after Scearch Hotel success message "Select Hotel"

    Examples: 
      | username    | password   | location | hotels      | roomtype | noofrooms | checkin  | checkout | adultsperroom | childperroom |
      | Vickyinpavi | 7397194873 | Sydney   | Hotel Creek | Double   | 2 - Two   | 21/12/22 | 23/12/22 | 2 - Two       | 2 - Two      |

  Scenario Outline: verifying Adactin Hotel login and enter SearchHotel Valid credentials
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should enter only mandattoryfields in SearchHotel "<location>","<noofrooms>","<checkin>","<checkout>" and "<adultsperroom>"
    Then User should need to verify after Scearch Hotel success message "Select Hotel"

    Examples: 
      | username    | password   | location | noofrooms | checkin  | checkout | adultsperroom |
      | Vickyinpavi | 7397194873 | Sydney   | 2 - Two   | 21/12/22 | 23/12/22 | 2 - Two       |

  Scenario Outline: verifying Adactin Hotel login and enter SearchHotel InValid credentials
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should enter allfields with wrong data in SearchHotel "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childperroom>"
    Then User should need to verify after Scearch Hotel date  error message "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username    | password   | location | hotels      | roomtype | noofrooms | checkin  | checkout | adultsperroom | childperroom |
      | Vickyinpavi | 7397194873 | Sydney   | Hotel Creek | Double   | 2 - Two   | 25/12/22 | 23/12/22 | 2 - Two       | 2 - Two      |

  Scenario Outline: verifying Adactin Hotel login and enter SearchHotel InValid credentials
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should not enter anyfields in SearchHotel
    Then User should need to verify after Scearch Hotel error message "Please Select a Location"

    Examples: 
      | username    | password   |
      | Vickyinpavi | 7397194873 |
