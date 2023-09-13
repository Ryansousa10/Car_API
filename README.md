<h1 align="center"> SpringBoot_Challenge01_RyanSousa</h1>
<img src="https://user-images.githubusercontent.com/74038190/240906093-9be4d344-6782-461a-b5a6-32a07bf7b34e.gif">

<br></br>
<h2>Project Structure</h2>

- 🏎️ **CarController** The CarController class is a Spring controller that handles HTTP requests related to cars. It has two main methods: registerCar: Handles POST requests to register new cars. It performs input validations, such as brand validation, and calls the service to save the car in the database. getCarByIdChassi: Handles GET requests to retrieve information about a car based on the chassis ID. It calls the service to fetch the car from the database.

- 🏎️ **Car** The Car class represents the car entity to be persisted in the database. It has JPA annotations to define that it is an entity managed by JPA and to map its fields to columns in the corresponding database table. It also includes data validation using column annotations.

- 🏎️ **CarRequestDTO** The CarRequestDTO class is a Data Transfer Object (DTO) used to receive input data from the HTTP request to register a new car. It contains fields representing the attributes of a car, such as brand, color, model, and manufacturing year. It includes validation annotations to ensure that the input data meets the specified criteria, such as valid brand.

- 🏎️ **CarResponseDTO** The CarResponseDTO class is another DTO but is used to represent the API response after registering a car or when retrieving a car by ID. It contains fields for the chassis ID and the car's brand, which are the main data returned.

- 🏎️ **CarMapper** The CarMapper class is responsible for mapping DTO objects to entities and vice versa. It contains methods to map CarRequestDTO objects to Car and Car objects to CarResponseDTO.(The CarMapper class is responsible for mapping DTO objects to entities and vice versa. It contains methods to map CarRequestDTO objects to Car and Car objects to CarResponseDTO.)

- 🏎️ **CarService** The CarService class is the underlying service that performs the business logic related to cars. The registerCar method receives a Car object as input, validates the data (brand and non-null fields), and saves the car to the database. The getCarByIdChassi method allows you to fetch a car from the database based on the chassis ID. Helper methods isValidBrand and validateCarFields assist in the necessary checks and validations.(The CarService class is the underlying service that performs the business logic related to cars. The registerCar method receives a Car object as input, validates the data (brand and non-null fields), and saves the car to the database. The getCarByIdChassi method allows you to fetch a car from the database based on the chassis ID. Helper methods isValidBrand and validateCarFields assist in the necessary checks and validations.)

- 🏎️ **InvalidBrandException** The InvalidBrandException class is a custom exception that is thrown when the car's brand is invalid. It extends RuntimeException and contains information about the invalid brand.

- 🏎️ **CarRepository** The CarRepository interface is a Spring Data JPA interface that extends JpaRepository. It provides ready-made methods for accessing the database related to the Car entity. No implementation is required as Spring Data JPA takes care of it.


<h3 align="center">Languages and Tools:</h3>
<p align="center"> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a> <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p><br>

<h2></h2How>How to Run the Project</h2>
<strong>To run the project locally, follow these steps:</strong><br></br>

<p>1- Clone the GitHub repository to your local machine.</p>
<p>2- Ensure you have Java and Maven installed.</p>
<p>3- Open the terminal in the project's root folder.</p>
<p>4- Run the command mvn spring-boot:run to start the application.</p>
<p>5- The application will be available at http://localhost:8080.</p>

<h2></h2Database>Database Configuration</h2>
The project is configured to use a local MySQL database. Make sure to update the database settings in the <strong>application.yaml</strong> file to match your configuration.

**Make sure your MySQL username and password are set to: "root"**

<h2></h2Requirements>Requirements</h2>
- Java 8 or higher.
- Maven.
- Configured MySQL database.

<h2></h2How>API Endpoints</h2>

The API has the following endpoints:

<p><strong>POST /cars:</strong> Registers a new car.</p>
<p><strong>GET /cars/{idChassi}:</strong> Retrieves information about a car based on the chassis ID.</p>
