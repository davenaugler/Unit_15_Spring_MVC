# Unit_15_Spring_MVC

## 01 - Creating a Plain Old Controller
- Added `@Controller` to our WelcomeController class and had it return "welcome"
- Created `welcome.html` within Templates folder
- Attached the two with the Thymeleaf dependency 
- Start the app and we are able to go to `localhost:8080` and see Welcome on our HTML page

## 02 - Introduction to Thymeleaf and the Model
- Introduced a small amount of Thymeleaf into the HTML
- Needed to add an extra Thymeleaf property to **_applications.properties_**
`spring.thymeleaf.prefix=file:src/main/resources/templates/`
- Completed the MVC (Model View Controller) pieces

## 03 - PostMapping with a Regular Controller
- The domain package represents content that'll be going to the database
- Difference between domain package and dto package
- domain objects get stored in a database and retrieved from a database
- dto is an object that's not persisted from a database. It's just used to transfer data from 
  one place to another through an API
- Removed static content from the controller
- Created a Person object and put a System.out in the postRootWebPage method
- 

## 04 - Using Thymeleaf Fields

## 05 - Creating a PersonRepository

## 06 - Fetching Person Objects and Displaying

## 07 - Editing Exising Person Objects

## 08 - Listing all People

## 09 - Deleting Person Objects from HashMap

## 10 - Adding Extra Navigation Links
