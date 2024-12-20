<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Management - Online Banking System</title>
    <link rel="stylesheet" href="styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            text-align: center;
        }
        .container {
            width: 80%;
            margin: 20px auto;
        }
        .user-table, .user-form {
            width: 100%;
            margin-bottom: 20px;
            border-collapse: collapse;
        }
        .user-table th, .user-table td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        .user-table th {
            background-color: #f2f2f2;
        }
        .user-form input, .user-form select, .user-form button {
            padding: 10px;
            width: 100%;
            margin: 5px 0;
            border: 1px solid #ddd;
        }
        .user-form button {
            background-color: #28a745;
            color: white;
            cursor: pointer;
        }
        .user-form button:hover {
            background-color: #218838;
        }
        .btn-delete {
            background-color: #dc3545;
            color: white;
            border: none;
            padding: 5px 10px;
            cursor: pointer;
        }
        .btn-delete:hover {
            background-color: #c82333;
        }
        .user-details {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }
    </style>
</head>
<body>

<header>
    <h1>Online Banking System - User Management</h1>
</header>

<div class="container">
    <!-- User Table Section -->
    <h2>User List</h2>
    <table class="user-table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Account Balance</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>001</td>
                <td>John Doe</td>
                <td>john.doe@example.com</td>
                <td>$5,000</td>
                <td>
                    <button class="btn-delete">Delete</button>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>Jane Smith</td>
                <td>jane.smith@example.com</td>
                <td>$2,500</td>
                <td>
                    <button class="btn-delete">Delete</button>
                </td>
            </tr>
            <!-- Add more users here -->
        </tbody>
    </table>

    <!-- User Form Section -->
    <h2>Add New User</h2>
    <form class="user-form">
        <input type="text" placeholder="Enter Full Name" required>
        <input type="email" placeholder="Enter Email Address" required>
        <input type="password" placeholder="Enter Password" required>
        <input type="number" placeholder="Initial Deposit" required>
        <button type="submit">Add User</button>
    </form>

    <!-- User Details Section -->
    <div class="user-details">
        <div>
            <h3>User Details</h3>
            <p><strong>Name:</strong> John Doe</p>
            <p><strong>Email:</strong> john.doe@example.com</p>
            <p><strong>Account Balance:</strong> $5,000</p>
            <p><strong>Account Status:</strong> Active</p>
        </div>
        <div>
            <h3>Update User Information</h3>
            <form class="user-form">
                <input type="text" placeholder="Update Full Name">
                <input type="email" placeholder="Update Email Address">
                <input type="number" placeholder="Update Account Balance">
                <button type="submit">Update User</button>
            </form>
        </div>
    </div>
</div>
