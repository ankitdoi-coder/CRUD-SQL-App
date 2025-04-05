📚 Student Management - CRUD SQL App
A simple and professional CRUD (Create, Read, Update, Delete) application built with Java Spring Boot and MySQL to manage student records.

🚀 Features
This application provides the following functionalities:

📋 Get All Student Details
Retrieve all student records from the database.

🔍 Fetch Student by Roll Number
Get details of a specific student using their roll number.

➕ Add New Student
Insert a new student into the database.

✏️ Update Student Details
Update an existing student’s information.

❌ Delete Student
Remove a student record using their roll number.

🛠️ Tech Stack
Backend: Java 17 / Spring Boot

Database: MySQL

ORM: Spring Data JPA / Hibernate

Build Tool: Maven

Tools: Postman (for API testing)

📦 Getting Started
1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/crud-sql-app.git
cd crud-sql-app
2. Set Up MySQL Database
Create a database in MySQL:

sql
Copy
Edit
CREATE DATABASE studentdb;
3. Configure application.properties
Update the src/main/resources/application.properties file:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
4. Run the Application
bash
Copy
Edit
mvn spring-boot:run
📄 API Endpoints
Method	Endpoint	Description
GET	/students	Get all student details
GET	/students/{rollNo}	Get student by roll number
POST	/students	Add a new student
PUT	/students/{rollNo}	Update student details
DELETE	/students/{rollNo}	Delete a student by roll no.
📦 Sample JSON Payload
json
Copy
Edit
{
  "rollNo": 101,
  "name": "John Doe",
  "age": 20,
  "branch": "Computer Science"
}
🧪 Testing
You can test the APIs using tools like Postman or cURL.

🙌 Contribution
Contributions are welcome!
Feel free to fork this project and submit a pull request.

📧 Contact
For questions, suggestions, or collaboration:
📩 ankitdoi82@gmail.com

⭐ Support
If you find this project helpful, give it a ⭐ and share it with others!

