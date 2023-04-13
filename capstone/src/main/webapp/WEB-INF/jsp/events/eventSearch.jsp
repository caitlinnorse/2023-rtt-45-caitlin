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
                        <input type="text" class="form-control" name="search" placeholder="Event Name"
                               aria-label="Event Name" value="${eventName}">
                    </div>
                    <button class="btn btn-outline-secondary" id="search">Search</button>

                </form>
            </div>
        </div>
    </div>
</section>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">

        <h4 class="pb-2">${eventsList.size()} Search Results</h4>

        <table class="table table-striped border">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Date</th>
                    <th scope="col">Location</th>
                    <th scope="col">Other Events</th>
                    <th scope="col">Event Type</th>
                    <th scope="col">Edit</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${eventsList}" var="event">
                    <tr>
                        <td><a href="/events/detail/${event.id}">${event.id}</a></td>
                        <td>${event.eventName}</td>
                        <td>${event.date}</td>
                        <td>${event.location}</td>
                        <td>${event.otherEvents}</td>
                        <td>${event.eventType}</td>
                        <td><a href="/events/edit/${event.id}">Edit</a></td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</section>

<jsp:include page="../includes/footer.jsp"/>