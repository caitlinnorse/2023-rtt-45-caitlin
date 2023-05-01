<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>


<jsp:include page="includes/header.jsp"/>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1>Event Detail</h1>
        <img src="${events.profileImage}" style="width: 150px; border-radius: 15px; padding-top: 20px;"/>
    </div>
</section>
<section class="pt-2 pb-3 bg-light-grey">
    <div class="container text-center">

        <table class="table table-striped border">
                    <tr>
                        <td>Name</td>
                        <td><a href="/eventSearch?search=${events.eventName}">${events.eventName}</a></td>
                    </tr>
                    <tr>
                        <td>Date</td>
                        <td><fmt:formatDate value="${events.date}" pattern="MMMM dd, yyyy" /></td>
                    </tr>
                    <tr>
                        <td>Location</td>
                        <td>${events.location}</td>
                    </tr>
                    <tr>
                        <td>Event Type</td>
                        <td><a href="/eventSearch?search=${events.eventType}">${events.eventType}</td>
                    </tr>
        </table>

        <div>
        <sec:authorize access="hasAnyAuthority('ADMIN')">
            <button onclick="window.location.href='/events/edit/${events.id}';" style="padding: 10px; width: 75px; margin: 20px; border-radius: 5px; border-color: #001E44; color: #001E44; background-color: #ebf1f7;">Edit</button>
        </sec:authorize>
            <c:if test="${not signedUp}">
                <button onclick="window.location.href='/events/eventSignup?eventId=${events.id}';" style="padding: 10px; width: 100px; margin: 20px; border-radius: 5px; border-color: #001E44; color: #001E44; background-color: #ebf1f7;">Signup</button>
            </c:if>
            <c:if test="${signedUp}">
                <button onclick="window.location.href='/events/remove/${events.id}';" style="padding: 10px; width: 100px; margin: 20px; border-radius: 5px; border-color: #001E44; color: #001E44; background-color: #ebf1f7;">Remove</button>
            </c:if>
        </div>
        <br>
        <h4 class="pb-2">${userEventsList.size()} Users Signed up for this Event</h4>

        <table class="table table-striped border" style="margin-bottom: 50px; margin-top: 15px;" >
                    <thead>
                        <tr>
                            <th scope="col">First Name</th>
                            <th scope="col">Last Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Instrument</th>
                            <th scope="col">Part</th>
                            <th scope="col">Year</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${userEventsList}" var="userEvents">
                            <tr>
                                <td>${userEvents.first_name}</td>
                                <td>${userEvents.last_name}</td>
                                <td>${userEvents.email}</td>
                                <td>${userEvents.instrument_name}</td>
                                <td>${userEvents.music_part}</td>
                                <td>${userEvents.band_year}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
    </div>
</section>
<jsp:include page="includes/footer.jsp"/>