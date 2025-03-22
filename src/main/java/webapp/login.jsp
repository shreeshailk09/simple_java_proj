<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin-top: 100px;
        }
        form {
            background: white;
            padding: 20px;
            display: inline-block;
            box-shadow: 0px 0px 10px gray;
            border-radius: 8px;
        }
        input {
            padding: 10px;
            margin: 10px;
            width: 80%;
        }
        button {
            padding: 10px;
            width: 85%;
            background: blue;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background: darkblue;
        }
    </style>
</head>
<body>

    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <input type="text" name="username" placeholder="Enter Username" required><br>
        <input type="password" name="password" placeholder="Enter Password" required><br>
        <button type="submit">Login</button>
    </form>

</body>
</html>
