@CancelBooking
Feature: verifying Adactin Hotel CancelBooking details

  Scenario Outline: verifying adactin login, search hotel by selecting all fields, select hotel, book hotel by entering details and cancel generated order Id
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
    And User should cancel generated order ID
    Then User should need to verify after cancel order ID success message "The booking has been cancelled."

    Examples: 
      | username    | password   | location | hotels      | roomtype | noofrooms | checkin  | checkout | adultsperroom | childperroom | firstname | lastname | billingaddress           |
      | Vickyinpavi | 7397194873 | Sydney   | Hotel Creek | Double   | 2 - Two   | 21/12/22 | 23/12/22 | 2 - Two       | 2 - Two      | Vignesh   | vicky    | 7/234B,GandhiNagar,Salem |

  Scenario Outline: verifying adactin login and cancel the existing order Id
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should cancel existing  order ID "<orderid>"
    Then User should need to verify after cancel order ID success message "The booking has been cancelled."

    Examples: 
      | username    | password   | orderid    |
      | Vickyinpavi | 7397194873 | 296762HB1O |
