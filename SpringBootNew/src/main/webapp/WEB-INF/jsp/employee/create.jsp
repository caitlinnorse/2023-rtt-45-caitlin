<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp"/>
<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <c:if test="${empty form.id}">
            <h1>Create Employee</h1>
        </c:if>
        <c:if test="${not empty form.id}">
            <h1>Edit Employee</h1>
        </c:if>
    </div>
</section>

    <section class="pt-5 pb-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-sm-12 col-md-7 col-xl-5">


                    <form action="/employee/createSubmit" method="POST">
                    <input type="hidden" name="id" value="${form.id}" />
                    <div class=" mb-3">
                        <c:if test="${not empty form.id}">
                            <label for="editEmp"  class="form-label"> Details </label>
                            <a  id="editEmp" href="/employee/detail/${form.id}"> Details </a>

                        </c:if>
                    </div>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input type="text" class="form-control" id="exampleInputEmail1" name="email"
                                aria-describedby="emailHelp" value="${form.email}">
                            <div id="emailHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="firstName" class="form-label" id="firstName" aria-describedby="firstNameHelp">First Name</label>
                            <input type="text" class="form-control" id="firstName" name="firstName" value="${form.firstName}">
                            <div id="firstNameHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                             <label for="lastName" class="form-label" id="lastName"
                                 aria-describedby="lastNameHelp">Last Name</label>
                              <input type="text" class="form-control" id="lastName" name="lastName" value="${form.lastName}">
                              <div id="lastNameHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="office" class="form-label">Office</label>
                            <select id="officeId" name="officeId" class="form-select">
                                <c:forEach items="${offices}" var="office">
                                    <option value="${office.id}"
                                    <c:if test="${office.id eq form.officeId}">
                                     selected
                                     </c:if>
                                     >${office.city}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label for="jobTitle" class="form-label" id="jobTitle"
                                aria-describedby="jobTitleHelp">Job Title</label>
                            <input type="text" class="form-control" id="jobTitle" name="jobTitle" value="${form.jobTitle}">
                            <div id="jobTitleHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="profileImage" class="form-label" id="profileImage"
                                aria-describedby="profileImageHelp">Profile Image</label>
                            <input type="text" class="form-control" id="profileImage" name="profileImage" value="${form.profileImage}">
                            <div id="profileImageHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="vacationHours" class="form-label"
                              aria-describedby="vacationHoursHelp">Vacation Hours</label>
                            <input type="number" class="form-control" id="vacationHours" name="vacationHours" value="${form.vacationHours}">
                            <div id="vacationHoursHelp" class="form-text"></div>
                        </div>

                        <div class="mb-3">
                             <label for="extension" class="form-label"
                                 aria-describedby="extensionHelp">Extension</label>
                             <input type="text" class="form-control" id="extension" name="extension" value="${form.extension}">
                             <div id="extensionHelp" class="form-text"></div>
                        </div>
                    <c:if test="${empty form.id}">
                        <button type="submit" id="create_btn" class="btn btn-primary mt-3 me-2" onclick="formSubmit()">Create Employee</button>
                    </c:if>
                    <c:if test="${not empty form.id}">
                        <button type="submit" id="edit_btn" class="btn btn-primary mt-3 me-2" onclick="formSubmit()">Edit Employee</button>
                    </c:if>
                    </form>
                </div>
            </div>
        </div>
    </section>


<jsp:include page="../include/footer.jsp"/>