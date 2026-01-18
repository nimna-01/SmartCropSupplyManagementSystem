<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Smart Crop Supply Management System</title>
</head>

<body>

    <h1>Smart Crop Supply Management System</h1>
    <p>
        Enterprise Application Development (EAD) Project
    </p>

    <hr>

    <h2>Introduction</h2>
    <p>
        The <strong>Smart Crop Supply Management System</strong> is a desktop-based application
        developed to manage crop supply workflows between officers, farmers, and buyers.
        The system simplifies farmer registration, crop management, supply preparation,
        and inventory tracking.
    </p>

    <hr>

    <h2>Key Features</h2>
    <ul>
        <li>Role-based login system (Officer, Farmer, Buyer)</li>
        <li>Officer dashboard with statistics overview</li>
        <li>Farmer management</li>
        <li>Crop management</li>
        <li>Prepare crop supply for buyers</li>
        <li>Inventory tracking</li>
        <li>Reports viewing</li>
        <li>Modern Java Swing user interface</li>
    </ul>

    <hr>

    <h2>Technology Stack</h2>
    <ul>
        <li>Programming Language: Java</li>
        <li>User Interface: Java Swing</li>
        <li>Layout Manager: MigLayout</li>
        <li>Theme: FlatLaf (Dark)</li>
        <li>Database: MySQL</li>
        <li>Database Connectivity: JDBC</li>
    </ul>

    <hr>

    <h2>Installation</h2>
    <ol>
        <li>Clone the project repository from GitHub.</li>
        <li>Install MySQL database server.</li>
        <li>Create a database for the system.</li>
        <li>Import the provided <strong>database.sql</strong> file.</li>
        <li>Configure database credentials in the DB connection file.</li>
    </ol>

    <hr>

    <h2>How to Run</h2>
    <p>
        You can run the system using the executable JAR file:
    </p>
    <p>
        <code>java -jar SmartCrop-v1.0.0.jar</code>
    </p>

    <p>
        Or run the project using an IDE such as NetBeans, IntelliJ IDEA, or Eclipse
        by setting the main class and running the application.
    </p>

    <hr>

    <h2>User Roles</h2>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>Role</th>
            <th>Description</th>
        </tr>
        <tr>
            <td>Officer</td>
            <td>Manages farmers, crops, inventory, and supply workflows</td>
        </tr>
        <tr>
            <td>Farmer</td>
            <td>Registers crops and provides supply details</td>
        </tr>
        <tr>
            <td>Buyer</td>
            <td>Views and requests prepared crop supplies</td>
        </tr>
    </table>

    <hr>

    <h2>Future Enhancements</h2>
    <ul>
        <li>Advanced reporting and analytics</li>
        <li>Export reports to PDF and Excel</li>
        <li>Notification system</li>
        <li>Improved data validation and security</li>
        <li>Web-based version of the system</li>
    </ul>

    <hr>

    <h2>License</h2>
    <p>
        This project is developed for educational purposes as part of a university coursework.
    </p>

    <hr>

    <p>
        © 2026 Smart Crop Supply Management System. All rights reserved.
    </p>

</body>
</html>
