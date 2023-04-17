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
            <form>
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
                <p>
                    Other availability:
                </p>
                <div id="dynamicCheckboxes">
                </div>
                </div>
                <br>


                <button type="button" class="btn btn-primary" id="submit_btn"
                    style="margin-top: 20px; margin-bottom: 20px;" onclick="formSubmit()">Submit</button>
            </form>
        </div>
    </section>

    <script>
        document.getElementById("event").addEventListener("change", fillCheckboxes);

        function fillCheckboxes() {
            selectEvent = document.querySelector('#event');
            eventOutput = selectEvent.options[selectEvent.selectedIndex].value;

            cbdiv = document.getElementById('dynamicCheckboxes');
            // Clear dynamicCheckboxes div
            while(cbdiv.firstChild) {
                cbdiv.removeChild(cbdiv.firstChild);
            }

            for(var i=0; i < selectEvent.length; i++) {
                if (selectEvent[i].value != eventOutput) {
                    var cb = document.createElement('input');
                    cb.type = 'checkbox';
                    cb.id = 'ExtraEventCheckBox';
                    cb.classList.add('form-check-input');
                    cb.value = selectEvent[i].value;

                    const label = document.createElement('label');
                    label.classList.add('form-check-label');
                    label.classList.add('mx-2'); // add margin to label left/right
                    console.log(selectEvent[i].value);
                    label.appendChild(document.createTextNode(selectEvent[i].value));

                    const lineBreak = document.createElement('br');
                    cbdiv.appendChild(cb);
                    cbdiv.appendChild(label);
                    cbdiv.appendChild(lineBreak);
                }
            }
        }

        fillCheckboxes();

        function formSubmit() {
            let emailInput = document.getElementById('exampleInputEmail1');
            let emailValue = emailInput.value;

            let firstNameInput = document.getElementById('firstName');
            let firstNameValue = firstNameInput.value;

            let lastNameInput = document.getElementById('lastName');
            let lastNameValue = lastNameInput.value;

            selectEvent = document.querySelector('#event');
            eventOutput = selectEvent.options[selectEvent.selectedIndex].value;

            extraEvent = document.getElementById("dynamicCheckboxes");
            const checkboxes = extraEvent.querySelectorAll('input[type="checkbox"]');

            let eventArray = [];
            for(var i = 0; i < checkboxes.length; i++) {
                if(checkboxes[i].checked) {
                    eventArray.push(checkboxes[i].value);
                }
            }

            let selectedInstrument;
            const radioButtons = document.querySelectorAll('input[name="instrument-radio"]');


            for (radioButton of radioButtons) {
                if (radioButton.checked) {
                    selectedInstrument = radioButton.value;
                    break;
                }
            }
            let instrumentRadioValue = selectedInstrument;


            selectPart = document.querySelector('#part');
            partOutput = selectPart.options[selectPart.selectedIndex].value;

            selectYear = document.querySelector('#bandYear');
            yearOutput = selectYear.options[selectYear.selectedIndex].value;



            if (emailValue == '') {
                emailInput.classList.add("is-invalid");
                // this will set the email input field to what ever text
                emailInput.value = "Enter your email";
                // now we can add an indvidual style to the input field
                emailInput.style.backgroundColor = "yellow";
                emailInput.style.cssText += "color:red";


                document.getElementById('emailHelp').innerText = "Please enter your email address";
                document.getElementById('emailHelp').style.cssText = "color:red";
            }

            if (firstNameValue == '') {
                // add the bootstrap class is-invalid to show an error
                firstNameInput.classList.add("is-invalid");
                // this will set the email input field to what ever text
                firstNameInput.value = "Enter your first name";
                // now we can add an indvidual style to the input field
                firstNameInput.style.backgroundColor = "yellow";
                firstNameInput.style.cssText += "color:red";

                document.getElementById('firstNameHelp').innerText = "Please enter your first name";
                document.getElementById('firstNameHelp').style.cssText = "color:red";
            }


            if (lastNameValue == '') {
                lastNameInput.classList.add("is-invalid");
                // this will set the email input field to what ever text
                lastNameInput.value = "Enter your last name";
                // now we can add an indvidual style to the input field
                lastNameInput.style.backgroundColor = "yellow";
                lastNameInput.style.cssText += "color:red";

                document.getElementById('lastNameHelp').innerText = "Please enter your last name";
                document.getElementById('lastNameHelp').style.cssText = "color:red";
            }
        }

    </script>
<jsp:include page="../includes/footer.jsp"/>
