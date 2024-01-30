# Unit_15_Spring_MVC

## 01 - Creating a Plain Old Controller
- Within Spring MVC we built out the View and Controller


## 02 - Introduction to Thymeleaf and the Model
- Spring MVC
  - Model: A hashmap that takes key's and values that are passed to the View
  - View: HTML pages and JPA's
  - Controller: files within `web` package. File name will end in Controller.
- Dynamically updated HTML using Thymeleaf within the HTML
- Needed to add an extra Thymeleaf property to **_applications.properties_** to add content to HTML files without needing 
to restart the server each time
```Java
spring.thymeleaf.prefix=file:src/main/resources/templates/
```


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
- Controllers should not interact with repository they should only interact with services and routing

## 06 - Fetching Person Objects and Displaying

## 07 - Editing Exising Person Objects

## 08 - Listing all People

## 09 - Deleting Person Objects from HashMap

## 10 - Adding Extra Navigation Links
