#Author: Lizeth Ortega Morales
  #lenguaje:en
  @stories
  Feature: Star #
    As user, I want to create business units and meetings within the Start Sharp application

    Background:
      Given than Lizeth wants to create business units and a meeting
        |user|password|
        |admin|serenity|

  @Scenario1
  Scenario Outline: Create business unit and a meeting
    When She create business units
    |name|parentUnit|
    |<name>|<parentUnit>|
    And She create meeting
    |meetingName|meetingType|startDate |startHour|location|unit    |organizedBy |meetingNumber|endDate   |endHour|reporter    |attendeeList   |
    |<meetingName>|<meetingType>|<startDate>|<startHour>|<location>|<unit>|<organizedBy>|<meetingNumber>|<endDate>|<endHour>|<reporter>|<attendeeList>|
    Then she successfully validates the creation of the meeting
    |meetingName|
    |<meetingName>|
    Examples:
    |name    |parentUnit|meetingName|meetingType|startDate |startHour|location|organizedBy |meetingNumber|endDate   |endHour|unit      |reporter    |attendeeList   |
    |Unidad Liz|Acme Corp.|Meeting prueba|Strategy   |10/05/2022|10:50   |HQ-01   |Aaron Taylor|0021        |11/05/2022|11:50  |Unidad Liz|Adam Edwards|Alexandra James|

    @Scenario2
    Scenario: Validate credentials for Start Sharp
      When she open the form Contact
      Then she successfully validates required fields into form Contact
        |Please validate empty or invalid inputs (marked with red) before submitting the form.|

    @Scenario3
    Scenario Outline: Validate credentials for Start Sharp
      Given than Lizeth wants to login other credentials
        |user|password|
        |<user>|<password>|
      Then she successfully validates that the credentials do not exist
        |Invalid username or password!|
      Examples:
        |user |password|
        |linkliz|serenity|