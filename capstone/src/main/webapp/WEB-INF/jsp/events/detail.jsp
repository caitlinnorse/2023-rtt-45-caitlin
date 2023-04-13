<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../includes/header.jsp"/>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1>Event Detail</h1>
    </div>
</section>
<section class="pt-5 pb-5 bg-light-grey">
    <div class="container text-center">

        <table class="table table-striped border">
                    <tr>
                        <td>ID</td>
                        <td>${events.id}</td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><a href="/events/eventSearch?search=${events.eventName}">${events.eventName}</a></td>
                    </tr>
                    <tr>
                        <td>Date</td>
                        <td>${events.date}</td>
                    </tr>
                    <tr>
                        <td>Location</td>
                        <td>${events.location}</td>
                    </tr>
                    <tr>
                        <td>Other Events</td>
                        <td>${events.otherEvents}</td>
                    </tr>
                    <tr>
                        <td>Event Type</td>
                        <td><a href="/events/eventSearch?search=${events.eventType}">${events.eventType}</td>
                    </tr>
                        <td>Edit</td>
                        <td><a href="/events/edit/${events.id}">Edit</a></td>
                    </tr>
        </table>
    </div>
</section>
<jsp:include page="../includes/footer.jsp"/>