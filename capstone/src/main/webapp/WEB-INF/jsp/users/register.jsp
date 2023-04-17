<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../includes/header.jsp"/>
    </div>
    <section>
        <div class="container mt-3" style="padding: 20px;">

            <h1>Create an Account</h1>
            <form action="/register" method="POST">
            <div class="panel form-rounded px-3">
                <div class="col-lg-6 mb-3">
                    <label for="exampleInputEmail1" class="form-label">Email address</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="row">
                <div class="col-lg-6 mb-3">
                    <label for="firstName" class="form-label">First Name</label>
                    <input type="text" class="form-control" id="firstName" name="firstName" aria-describedby="firstNameHelp">
                    <div id="firstNameHelp" class="form-text"></div>
                </div>
                <div class="col-lg-6 mb-3">
                    <label for="lastName" class="form-label">Last Name</label>
                    <input type="text" class="form-control" id="lastName" name="lastName" aria-describedby="lastNameHelp">
                    <div id="lastNameHelp" class="form-text"></div>
                </div>
                </div>

                <br>

                <div class="mb-3">
                    <label for="password" class="form-label" id="passwordLabel"
                        aria-describedby="passwordHelp">Password</label>
                    <input type="password" class="form-control" id="password" name="password">
                    <div id="passwordHelp" class="form-text">Minimum 8 Characters with an uppercase, lowercase, and
                        a
                        number.</div>
                </div>
                <div class="mb-3">
                    <label for="confirmPassword" class="form-label" id="confirmPasswordLabel"
                        aria-describedby="confirmPasswordHelp">Confirm Password</label>
                    <input type="password" class="form-control" id="confirmPassword" name="confirmPassword">
                    <div id="confirmPasswordHelp" class="form-text">Re-enter Password.</div>
                </div>
                <div class="mb-3">
                                            <label for="instrument" class="form-label">Instrument</label>
                                            <select id="instrumentId" name="instrument" class="form-select">
                                                <c:forEach items="${instruments}" var="instrument">
                                                    <option value="${instrument.id}"
                                                    <c:if test="${instrument.id eq form.instrumentId}">
                                                     selected
                                                     </c:if>
                                                     >${instrument.instrumentName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>

                                <div class="row">
                                <div class="col-lg-4 mb-3">
                                <p>Part</p>
                                <div class="mt-3">
                                    <select name="musicPart" id="musicPart" class="form-rounded">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                    </select>
                                </div>
                                </div>
                                <div class="col-lg-4 mb-3">
                                <p>Year in Band</p>
                                <div class="mt-3">
                                    <select name="bandYear" id="bandYear" class="form-rounded">
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                    </select>
                                </div>
                                </div>
                                </div>


                <button type="submit" id="create_btn" class=" btn btn-primary mt-3 me-3">Create
                    Account</button>
                <br>
            </form>
        </div>
    </section>


<jsp:include page="../includes/footer.jsp"/>