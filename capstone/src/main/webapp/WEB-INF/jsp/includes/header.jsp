<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

        <script src='https://cdn.jsdelivr.net/npm/fullcalendar@6.1.5/index.global.min.js'></script>


    <link rel="stylesheet" href="/Home.css" />
    <link href="<c:url value='/pub/css/home.css' />" rel="stylesheet">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:wght@400;700&display=swap" rel="stylesheet">

</head>
<style>
    h1, h2, div {
        font-family: "Libre Baskerville";
    }


</style>

<body>

    <div>
        <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #001E44;">
            <div class="container-fluid">
                <a class="navbar-brand" href="#" ><img style="width: 45px;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-bcQCKlmEsOZYlOZ3Xy4q-zVMOqCzLEJQfw&usqp=CAU" ></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/home">Home</a>
                        </li>
                        <li>
                            <a class="nav-link" href="/eventSearch">Search</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false">
                                Events
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <li><a class="dropdown-item" href="/thon">THON</a></li>
                                <li><a class="dropdown-item" href="/fiveK">Blue Band 5K</a></li>
                                <li><a class="dropdown-item" href="/basketballGames">Basketball Games</a></li>
                                <li><a class="dropdown-item" href="/footballGames">Football Games</a></li>
                                <li><a class="dropdown-item" href="/events/create">Create</a></li>
                            </ul>
               <sec:authorize access="isAuthenticated()">
                     <li class="nav-item">
                         <a class="nav-link" href="/login/logout">Logout</a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link" href=""><sec:authentication property="principal.username" /></a>
                     </li>
                 </sec:authorize>
                 <sec:authorize access="!isAuthenticated()">
                     <li class="nav-item">
                         <a class="nav-link" href="/login/loginPage">Login</a>
                     </li>

                 </sec:authorize>
                 <sec:authorize access="!isAuthenticated()">
                     <li class="nav-item">
                         <a class="nav-link" href="/users/register">Register</a>
                     </li>

                 </sec:authorize>
                 <sec:authorize access="hasAnyAuthority('ADMIN')">
                 <li class="nav-item">
                    <a class="nav-link" href="">Admin Link</a>
                 </li>
                </sec:authorize>
                    </ul>
                </div>
            </div>
        </nav>