<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../includes/header.jsp"/>
<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <c:if test="${empty form.id}">
            <h1>Create Event</h1>
        </c:if>
        <c:if test="${not empty form.id}">
            <h1>Edit Event</h1>
        </c:if>
    </div>
</section>

    <section class="pt-5 pb-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-sm-12 col-md-7 col-xl-5">


                    <form action="/events/createSubmit" method="POST">
                    <input type="hidden" name="id" value="${form.id}" />
                    <div class=" mb-3">
                        <c:if test="${not empty form.id}">
                            <label for="editEvent"  class="form-label"></label>
                            <a  id="editEvent" href="/detail/${form.id}"> Details </a>

                        </c:if>
                    </div>
                        <div class="mb-3">
                            <label for="eventName" class="form-label" id="eventName" aria-describedby="eventNameHelp">Event Name</label>
                            <input type="text" class="form-control" id="eventName" name="eventName" value="${form.eventName}">
                            <div id="eventNameHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                             <label for="date" class="form-label" id="date"
                                 aria-describedby="dateHelp">Date</label>
                              <input type="text" class="form-control" id="date" name="date" value="${form.date}">
                              <div id="dateHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="location" class="form-label" id="location"
                                aria-describedby="locationHelp">Location</label>
                            <input type="text" class="form-control" id="location" name="location" value="${form.location}">
                            <div id="locationHelp" class="form-text"></div>
                        </div>
                        <div class="mb-3">
                            <label for="otherEvents" class="form-label"
                              aria-describedby="otherEventsHelp">Other Events</label>
                            <input type="text" class="form-control" id="otherEvents" name="overEvents" value="${form.otherEvents}">
                            <div id="otherEvents" class="form-text"></div>
                        </div>

                        <div class="mb-3">
                             <label for="eventType" class="form-label"
                                 aria-describedby="eventTypeHelp">Event Type</label>
                             <input type="text" class="form-control" id="eventType" name="eventType" value="${form.eventType}">
                             <div id="eventTypeHelp" class="form-text"></div>
                        </div>
                    <c:if test="${empty form.id}">
                        <button type="submit" id="create_btn" class="btn btn-primary mt-3 me-2" onclick="formSubmit()">Create Event</button>
                    </c:if>
                    <c:if test="${not empty form.id}">
                        <button type="submit" id="edit_btn" class="btn btn-primary mt-3 me-2" onclick="formSubmit()">Edit Event</button>
                    </c:if>
                    </form>
                </div>
            </div>
        </div>
    </section>


<jsp:include page="../includes/footer.jsp"/>