  <jsp:include page="includes/header.jsp"/>
   </div>
    <section>
        <div class="container mt-3">
            <h1>Sign up for an Event!</h1>
            <h1>Welcome to the Blue Band Event Signup!</h1>
            <form>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="mb-3">
                    <label for="firstName" class="form-label">First Name</label>
                    <input type="text" class="form-control" id="firstName" aria-describedby="firstNameHelp">
                    <div id="firstNameHelp" class="form-text"></div>
                </div>
                <div class="mb-3">
                    <label for="lastName" class="form-label">Last Name</label>
                    <input type="text" class="form-control" id="lastName" aria-describedby="lastNameHelp">
                    <div id="lastNameHelp" class="form-text"></div>
                </div>

                <br>
                <p>Event</p>
                <div class="mt-3">
                    <select name="performanceEvent" id="event">
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
                <br>
                <p>Instrument</p>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Piccolo" id="piccolo"
                        checked>
                    <label class="form-check-label" for="piccolo">
                        Piccolo
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Clarinet" id="clarinet">
                    <label class="form-check-label" for="clarinet">
                        Clarinet
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Saxophone"
                        id="saxophone">
                    <label class="form-check-label" for="saxophone">
                        Saxophone
                </div>
                <div class="form-check">
                    </label>
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Trumpet" id="trumpet">
                    <label class="form-check-label" for="trumpet">
                        Trumpet
                    </label>
                </div>
                <div>
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Mellophone"
                        id="mellophone">
                    <label class="form-check-label" for="mellophone">
                        Mellophone
                    </label>
                </div>
                <div>
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Trombone" id="trombone">
                    <label class="form-check-label" for="trombone">
                        Trombone
                    </label>
                </div>
                <div>
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Baritone" id="baritone">
                    <label class="form-check-label" for="baritone">
                        Baritone
                    </label>
                </div>
                <div>
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Sousaphone"
                        id="sousaphone">
                    <label class="form-check-label" for="sousaphone">
                        Sousaphone
                    </label>
                </div>
                <div>
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Drums" id="drums">
                    <label class="form-check-label" for="drums">
                        Drums
                    </label>
                </div>
                <div>
                    <input class="form-check-input" type="radio" name="instrument-radio" value="Majorette"
                        id="majorette">
                    <label class="form-check-label" for="majorette">
                        Majorette
                    </label>
                </div>
                <br>
                <p>Part</p>
                <div class="mt-3">
                    <select name="part" id="part">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                    </select>
                </div>
                <br>
                <p>Year in Band</p>
                <div class="mt-3">
                    <select name="bandYear" id="bandYear">
                        <option>1st Year</option>
                        <option>2nd Year</option>
                        <option>3rd Year</option>
                        <option>4th Year</option>
                        <option>5th Year</option>
                    </select>
                </div>
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
                    cb.class = 'ExtraEventClass';
                    cb.value = selectEvent[i].value;

                    const label = document.createElement('label');
                    console.log(selectEvent[i].value)
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
    <jsp:include page="includes/footer.jsp"/>