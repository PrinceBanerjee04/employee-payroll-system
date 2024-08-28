# EmployeePayrollSpringBootProject

This is a Spring Boot API for managing employee payroll data, built to streamline payroll processing within an organization. The API supports various CRUD operations such as registering employees, retrieving employee details by ID, calculating and storing payroll information, and managing payroll records. It integrates MySQL for data persistence, employs Lombok for efficient code management, and uses Spring Security to ensure the protection of sensitive employee and payroll data.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [License](#license)
- [Contact](#contact)

## Features
- **Register Employee:** Add a new employee to the database.
- **Get Employee by ID:** Retrieve specific employee details using their ID.
- **Get All Employees:** Fetch details of all employees in the database.
- **Calculate and Store Payroll:** Compute and save payroll details such as gross pay, net pay, and pay period for each employee.
- **Delete Employee:** Remove an employee and their associated payroll data from the database.

## Technologies Used
- **Java**: Core programming language.
- **Spring Boot**: Framework used for building the RESTful API.
- **Maven**: Build automation tool.
- **Lombok**: Reduces boilerplate code (like getters, setters).
- **MySQL**: Relational database used to store student data.

## Project Structure
```bsh
EmployeePayrollSystemSpringBootProject
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── employeepayrollsystem
│   │   │               ├── controller
│   │   │               ├── exception
|   |   |               ├── model
│   │   │               ├── repository
|   |   |               ├── security
│   │   │               ├── service
│   │   │               └── EmployeePayrollSystemApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── application-local.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── employeepayrollsystem
│                       └── EmployeePayrollSystemApplicationTests.java
└── pom.xml
```

- **`controller`**: Contains REST controllers that handle incoming HTTP requests and responses related to employees and payroll.
- **`exception`**: Contains custom exception classes for handling application-specific errors.
- **`model`**: Contains the JPA entities representing the database tables for employees and payroll data.
- **`repository`**: Contains repository interfaces for CRUD operations on the database.
- **`security`**: Contains security configurations and classes for managing authentication and authorization.
- **`service`**: Contains service classes that implement the business logic for managing employees and payroll.
- **`EmployeePayrollSystemApplication.java`**: Main class to run the Spring Boot application.

   ## Setup and Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/excptional/EmployeePayrollSystemSpringBootProject.git
   cd EmployeePayrollSystemSpringBootProject
   ```

2. **Configure MySQL Database**
   - Create a new database in MySQL named `employee_payroll`.
   - Configure the database connection in `src/main/resources/application.yml`, `src/main/resources/application-dev.yml`, and `src/main/resources/application-prod.yml`.

3. **Build the Project**
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Employee Controller

| Method | Endpoint                          | Description                          |
|--------|-----------------------------------|--------------------------------------|
| POST   | `/employees`                      | Register a new employee              |
| GET    | `/employees/{id}`                 | Get an employee by ID                |
| GET    | `/employees/all`                  | Get all employees                    |
| PUT    | `/employees/{id}/payroll`         | Calculate and store payroll for an employee |
| DELETE | `/employees/{id}`                 | Delete an employee by ID             |



## Database Configuration

Configure your database settings in the `src/main/resources/application.properties` file:

```properties
spring.application.name=EmployeePayrollSystem
spring.datasource.url=jdbc:mysql://localhost:3306/payroll_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, feel free to reach out:

- **Name**: [Prince Banerjee]()
- **Email**: [banerjee.prince69@gmail.com]()
- **LinkedIn**: [Prince Banerjee](https://www.linkedin.com/in/prince-banerjee-08363b271/)

---

This `README.md` file provides a comprehensive guide to your **EmployeePayrollSystemSpringBootProject**, outlining its structure, features, setup instructions, and API usage. You can customize it further based on your specific project details.
