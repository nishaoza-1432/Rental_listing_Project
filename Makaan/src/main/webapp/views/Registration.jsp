<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Signup Form</title>
</head>
<body>
    <h1>Signup</h1>
    <form action="/Registration" method="post">
        <label for="name">Owner Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <label for="contactno">Contact No.:</label>
        <input type="number" id="contactno" name="contactno" required><br><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>