# JDBC-Demo-Project

This project is a simple demonstration of using Java Database Connectivity (JDBC) to connect to a PostgreSQL database, execute a query, and retrieve results.

## Project Overview
The JDBC-Demo-Project showcases a basic example of how to connect to a PostgreSQL database using JDBC, execute a query, and print the result to the console.

## Technologies Used
- **Java**: Programming language used for writing the demo script.
- **JDBC**: Java Database Connectivity API used for database operations.
- **PostgreSQL**: Database management system used in the demo.

## Project Structure
```
JDBC-Demo-Project/
├── .idea/                   # Project configuration files
├── src/
│   └── demo.java            # Main demo script
├── .gitignore               # Git ignore file
├── JDBC.iml                 # IntelliJ IDEA module file
└── README.md                # Readme file
```

## Setup and Usage
1. **Clone the repository**
   ```sh
   git clone https://github.com/your-username/JDBC-Demo-Project.git
   cd JDBC-Demo-Project
   ```

2. **Update Database Credentials**
   - Open `demo.java` and update the `url`, `uname`, and `pass` variables with your PostgreSQL database details.

3. **Run the Demo**
   - Compile and run `demo.java` to see the output from the database query.
   ```sh
   javac src/demo.java
   java -cp .:path/to/postgresql-connector.jar src/demo
   ```

## License
This project is licensed under the MIT License.

## Contact
For any questions or suggestions, feel free to contact:
- **Ahmed Elgebali**: [LinkedIn](https://linkedin.com/in/ahmedelgebali/) | [Email](mailto:elgebalia34@gmail.com)

Thank you for checking out the JDBC-Demo-Project!
