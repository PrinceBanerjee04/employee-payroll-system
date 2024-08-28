# StudentManagerSpringBootProject

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
StudentManagerSpringBootProject
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── studentmanager
│   │   │               ├── controller
│   │   │               ├── entity
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               └── StudentManagerApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── studentmanager
│                       └── StudentManagerApplicationTests.java
└── pom.xml
```

- **`controller`**: Contains REST controllers that handle incoming HTTP requests and responses.
- **`entity`**: Contains the JPA entities representing the database tables.
- **`repository`**: Contains the repository interfaces for database operations.
- **`service`**: Contains the service classes implementing business logic.
- **`StudentManagerApplication.java`**: Main class to run the Spring Boot application.

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

#### API URL
```bash
https://studentmanagerspringbootproject-exceptional.up.railway.app
```

### Student Controller

| Method | Endpoint                         | Description                        |
|--------|----------------------------------|------------------------------------|
| POST   | `/students`                      | Register a new student             |
| GET    | `/students/{rollNo}`             | Get a student by roll number       |
| GET    | `/students/all`                  | Get all students                   |
| DELETE | `/students/{id}`                 | Delete a student by id    |



## Database Configuration

Configure your database settings in the `src/main/resources/application-dev.yml` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_details
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
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
