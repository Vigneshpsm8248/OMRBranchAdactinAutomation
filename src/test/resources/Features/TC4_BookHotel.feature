@BookHotel
Feature: verifying Adactin Hotel BookHotel details

  Scenario Outline: verifying Adactin BookHotel with entering details
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should enter allfields in SearchHotel "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childperroom>"
    Then User should need to verify after Scearch Hotel success message "Select Hotel"
    And User should Select Hotel Name
    Then User should need to verify after click Continue success message "Book A Hotel"
    And User should enter allfields in BookHotel "<firstname>","<lastname>" and "<billingaddress>"
      | creditcardno     | creditcardtype   | expirymonth | expiryyear | cvvnumber |
      | 8675456389765467 | VISA             | May         |       2022 |       786 |
      | 9234563234536754 | American express | June        |       2022 |       786 |
      | 7452987654563765 | Master card      | July        |       2022 |       786 |
    Then User should verify after click BookNow success message "Booking Confirmation" and save the generated order ID

    Examples: 
      | username    | password   | location | hotels      | roomtype | noofrooms | checkin  | checkout | adultsperroom | childperroom | firstname | lastname | billingaddress           |
      | Vickyinpavi | 7397194873 | Sydney   | Hotel Creek | Double   | 2 - Two   | 21/12/22 | 23/12/22 | 2 - Two       | 2 - Two      | Vignesh   | vicky    | 7/234B,GandhiNagar,Salem |

  Scenario Outline: verifying Adactin BookHotel without entering any details
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should enter allfields in SearchHotel "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childperroom>"
    Then User should need to verify after Scearch Hotel success message "Select Hotel"
    And User should Select Hotel Name
    Then User should need to verify after click Continue success message "Book A Hotel"
    And User should not enter anyfields in BookHotel
    Then User should verify after click BookNow error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username    | password   | location | hotels      | roomtype | noofrooms | checkin  | checkout | adultsperroom | childperroom |
      | Vickyinpavi | 7397194873 | Sydney   | Hotel Creek | Double   | 2 - Two   | 21/12/22 | 23/12/22 | 2 - Two       | 2 - Two      |
