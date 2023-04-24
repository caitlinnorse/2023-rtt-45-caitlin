<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../includes/header.jsp"/>
<style>
.form-rounded {
    border-style: solid;
    border-width: 1px;
    border-radius: 0.7rem;
    border-color: #041E42;
}
</style>
   </div>
    <section>
        <div class="container">
            <br>
            <div color=#041E42>
            <h1>Welcome to the Blue Band Event Signup!</h1>
            <h2>Sign up for an Event!</h2>
            </div>
            <br>
            <form method="POST" action="/events/eventSignup">
            <div class="panel form-rounded px-3" style="padding: 20px;">
                <div class="panel form-rounded p-2">Event
                <div class="mt-3 px-2">
                    <select name="performanceEvent" id="event" class="form-rounded">
                        <option>THON</option>
                        <option>Blue Band 5K</option>
                        <option>Basketball Game</option>
                        <option>Football Game</option>
                    </select>
                </div>
                <br>
                <div>
                <input type="checkbox" id="THON" name="thon" value="THON">
                <label for="thon">THON</label><br>
                <input type="checkbox" id="Blue Band 5K" name="blueBand5K" value="blueBand5K">
                <label for="blueBank5K">Blue Band 5K</label><br>
                <input type="checkbox" id="basketballGame" name="basketballGame" value="basketballGame">
                <label for="basketballGame">Basketball Game</label><br>
                <input type="checkbox" id="footballGame" name="footballGame" value="footballGame">
                <label for="footballGame">Football Game</label><br>
                </div>


                <button type="button" class="btn btn-primary" id="submit_btn"
                    style="margin-top: 20px; margin-bottom: 20px;" onclick="formSubmit()">Submit</button>
            </form>
        </div>
    </section>


<jsp:include page="../includes/footer.jsp"/>
