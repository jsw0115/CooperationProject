<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>MAIN</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <style>
        header {
            background-color: skyblue;
            padding: 20px;
        }

        nav {
            background-color: #3D8FEA;
            padding: 10px;
            color: white;
        }

        main {
            background-color: gray;
            padding: 20px;
            color: white;
        }

        footer {
            background-color: skyblue;
            padding: 20px;
        }

        button {
            background-color: #196DCB;
            padding: auto;
        }

        button:hover {
            background-color: #0B56AB;
            padding: auto;
        }
    </style>
</head>
<body>
    <header>
        <h1>Header Section</h1>
    </header>

    <nav>
        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
    </nav>

    <main>
        <h2>Main Section</h2>
        <p>This is the main content of the web page.</p>
    </main>

    <footer>
        <p>Footer Section &copy; 2023</p>
    </footer>
</body>
</html>