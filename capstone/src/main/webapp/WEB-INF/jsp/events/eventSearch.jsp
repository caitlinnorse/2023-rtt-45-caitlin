<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../includes/header.jsp"/>

</div>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1>Event Search</h1>
    </div>
</section>

<section class="pt-5 pb-5 bg-light-grey">
    <div class="container">
        <div class="row text-center justify-content-center">
            <div class="col-5">
                <form>
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" name="firstName" placeholder="Event Name"
                               aria-label="Event Name" value="${searchParamFirst}">
                    </div>
                    <button class="btn btn-outline-secondary" id="search">Search</button>

                </form>
            </div>
        </div>
    </div>
</section>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">

        <h4 class="pb-2">${employeesList.size()} Search Results</h4>

        <table class="table table-striped border">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Job Title</th>
                    <th scope="col">Office City</th>
                    <th scope="col">Edit</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${employeesList}" var="emp">
                    <tr>
                        <td><a href="/employee/detail/${emp.id}">${emp.id}</a></td>
                        <td>${emp.firstName}</th>
                        <td>${emp.lastName}</td>
                        <td>${emp.email}</td>
                        <td>${emp.jobTitle}</td>
                        <td>${emp.officeId}</td>
                        <td><a href="/employee/edit/${emp.id}">Edit</td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</section>

<jsp:include page="../includes/footer.jsp"/>