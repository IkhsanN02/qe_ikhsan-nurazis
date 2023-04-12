Nama : Ikhsan Nurazis
Kelas : C - Quality Engineer

RESTful API Testing with Rest Assured

REST API
API Concept And Fundamental

API Concept
    User        -> Waiter    -> Kitchen
(mobile app)       (API)     (Application)

Fundamental API Integration
mobile > API Server > Ext Process > API Testing
test process
1.  reconrd, define API information
2.  Parsing, Filter or Recording API Data And then extract 
3.  Reconstruction API calls, and sent them form a simulate client
4.  Test Validation

The Practical Test Pyramid
UI            > (End to End) Test the interaction between The overall thorugh the user interface
Integration   > Test the interaction between two modules or sub-system through API Contract
Component     > Test a specific modules or sub-system through the api
UNIT          > Test the smallest testable part of an application through methods

BDD with Cucumber
the step overview
1. write story
2. map steps to java
3. configure stories
4. run stories
5. view reports

Rest Assured and The Features
Supports for HTTP methods
Supports for BDD / Gherkin (Given, When, Then)
Use of Hamcrest matches for checks (equalTo)
User of Gpath for selecting element from JSON response

Preparation
mare sure everyting below are installed
Java, Maven, and Intellij IDEA
