<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp"/>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1>Employee Detail</h1>
    </div>
</section>
<section class="pt-5 pb-5 bg-light-grey">
    <div class="container text-center">

        <table class="table table-striped border">
                    <tr>
                        <td>ID</td>
                        <td>${employee.id}</td>
                    </tr>
                    <tr>
                        <td>First Name</td>
                        <td><a href="/employee/search?firstName=${employee.firstName}">${employee.firstName}</a></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><a href="/employee/search?lastName=${employee.lastName}">${employee.lastName}</td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td>${employee.email}</td>
                    </tr>
                    <tr>
                        <td>Extension</td>
                        <td>${employee.extension}</td>
                    </tr>
                    <tr>
                        <td>Job Title</td>
                        <td>${employee.jobTitle}</td>
                    </tr>
                    <tr>
                        <td>Vacation Hours</td>
                        <td>${employee.vacationHours}</td>
                    </tr>
        </table>
    </div>
</section>
<jsp:include page="../include/footer.jsp"/>