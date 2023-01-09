@SelectHotel
Feature: verifying Adactin Hotel SelectHotel details

  Scenario Outline: verifying adactin select hotel by clicking hotel name
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should enter allfields in SearchHotel "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childperroom>"
    Then User should need to verify after Scearch Hotel success message "Select Hotel"
    And User should Select Hotel Name
    Then User should need to verify after click Continue success message "Book A Hotel"

    Examples: 
      | username    | password   | location | hotels      | roomtype | noofrooms | checkin  | checkout | adultsperroom | childperroom |
      | Vickyinpavi | 7397194873 | Sydney   | Hotel Creek | Double   | 2 - Two   | 21/12/22 | 23/12/22 | 2 - Two       | 2 - Two      |

  Scenario Outline: verifying adactin select hotel by without clicking hotel name
    Given User is on the Adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello vickyinpavi!"
    And User should enter allfields in SearchHotel "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childperroom>"
    Then User should need to verify after Scearch Hotel success message "Select Hotel"
    And User should not Select Hotel Name
    Then User should need to verify after click Continue error message "Please Select a Hotel"

    Examples: 
      | username    | password   | location | hotels      | roomtype | noofrooms | checkin  | checkout | adultsperroom | childperroom |
      | Vickyinpavi | 7397194873 | Sydney   | Hotel Creek | Double   | 2 - Two   | 21/12/22 | 23/12/22 | 2 - Two       | 2 - Two      |
