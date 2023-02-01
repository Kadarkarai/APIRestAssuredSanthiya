Feature: PET Crud

Scenario: Create a pet
Given create the pet object with random information
And prepare for post request
When send the payload to url "/v2/pet"
Then validate the response contains the status code as "200"
#
#Scenario: Get the pet details
#Given prepare for get request
#When send the request to url "/v2/pet/" with id value
#Then status code is equal to ‘200’
#And content type is ‘application/json’
#And verify the pet and name 
#And Verify the current status