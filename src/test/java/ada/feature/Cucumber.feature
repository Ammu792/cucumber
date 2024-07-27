Feature:Book A hotel in the Adactin application
Scenario: login into the Adactin application
Given user launch the Adactin webpage
When user Enters The Username In The Username Field
And user Enters The Password In The Password Field
Then user Clicks The Login Button And It Navigates To Search Hotel page
Scenario:user search hotel field 
When User selects location from the drop-down "Sydney"
And User selects hotel from the drop-down "Hotel Creek"
And User selects room type from the drop-down "Standard"
And User selects number of rooms from the drop-down "1 - One"
And User selects adults per room from the drop-down "1 - One"
And User selects children per room from the drop-down "1 - None"
And User clicks on the search button
Scenario: select the hotel from the list
When User selects a hotel 
When  user click on the contiute button
And scroll down the page 
Scenario:user fills the user information And user  booking conformation
 When user enters the firts name  in the first name field
 And user enters the last name in the last name field
 And user enters the billing Address in addres field
 And user enter the card number in card number field with 16 digit
 And user select credit card type from the drop-down"American Express"
 And user select the expirydate field with select the month from the drop down "january"
 And select the year from the drop down "2025"
 And also user enters the cvv number in cvv field "1234"
 And also user clicks the Book now button 
 Scenario:Navigate to my Itinerary , take screenshot,and logout
 And I click on the my Itinerary button
 Then I should be redirected to the itinerary page 
 And I take a screenshot of the itinerary page
 When I click on the logout button
 Then i should see the logout successful message
   
    

