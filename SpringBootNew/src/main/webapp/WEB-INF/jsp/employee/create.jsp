<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp"/>
<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1>Create Employee</h1>
    </div>
</section>

    <section class="pt-5 pb-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-sm-12 col-md-7 col-xl-5">


                    <form action="/employee/createSubmit">
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input type="text" class="form-control" id="exampleInputEmail1" name="email"
                                aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="firstName" class="form-label" id="firstName" aria-describedby="firstNameHelp">First Name</label>
                            <input type="text" class="form-control" id="firstName" name="firstName">
                            <div id="firstNameHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                             <label for="lastName" class="form-label" id="lastName"
                                 aria-describedby="lastNameHelp">Last Name</label>
                              <input type="text" class="form-control" id="lastName" name="lastName">
                              <div id="lastNameHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="office" class="form-label">Office</label>
                            <select id="officeId" name="officeId" class="form-select">
                                <c:forEach items="${offices}" var="office">
                                    <option value=${office.id}>${office.city}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label for="jobTitle" class="form-label" id="jobTitle"
                                aria-describedby="jobTitleHelp">Job Title</label>
                            <input type="text" class="form-control" id="jobTitle" name="jobTitle">
                            <div id="jobTitleHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="vacationHours" class="form-label"
                              aria-describedby="vacationHoursHelp">Vacation Hours</label>
                            <input type="number" class="form-control" id="vacationHours" name="vacationHours">
                            <div id="vacationHoursHelp" class="form-text"></div>
                        </div>

                        <div class="mb-3">
                             <label for="extension" class="form-label"
                                 aria-describedby="extensionHelp">Extension</label>
                             <input type="text" class="form-control" id="extension" name="extension">
                             <div id="extensionHelp" class="form-text"></div>
                        </div>
                        <button type="submit" id="create_btn" class=" btn btn-primary mt-3 me-3"  onclick="formSubmit()">Create Account</button>
                    </form>
                </div>
            </div>
        </div>
    </section>


<jsp:include page="../include/footer.jsp"/>