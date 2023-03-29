function formSubmit() {
    let emailInput = document.getElementById('exampleInputEmail1');
    let emailValue = emailInput.value;
    //console.log("form submitted" + emailValue);
    //console.log(emailInput);

    let firstNameInput = document.getElementById('firstName');
    let firstNameValue = firstNameInput.value;

    let lastNameInput = document.getElementById('lastName');
    let lastNameValue = lastNameInput.value;

    let passInput = document.getElementById('password');
    let passValue = passInput.value;

    let confirmInput = document.getElementById('confirmPassword');
    let confirmValue = confirmInput.value;

    if(confirmValue != passValue) {
        //alert("Password does not match!");

        passInput.classList.add("is-invalid");
        passInput.style.backgroundColor = "yellow";
        passInput.style.cssText += "color:red";
        confirmInput.classList.add("is-invalid");
        confirmInput.style.backgroundColor = "yellow";
        confirmInput.style.cssText += "color:red";

        document.getElementById('confirmPasswordHelp').innerText = "Passwords do not match";
        document.getElementById('confirmPasswordHelp').style.cssText = "color:red";

        document.getElementById('passwordHelp').innerText = "Passwords do not match";
        document.getElementById('passwordHelp').style.cssText = "color:red";
    }

    if (emailValue == '') {
        //alert("Email is required.");
        // add the bootstrap class is-invalid to show an error
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
        //alert("First Name is required.");
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
        //alert("Last Name is required.");
        // add the bootstrap class is-invalid to show an error
        lastNameInput.classList.add("is-invalid");
        // this will set the email input field to what ever text
        lastNameInput.value = "Enter your last name";
        // now we can add an indvidual style to the input field
        lastNameInput.style.backgroundColor = "yellow";
        lastNameInput.style.cssText += "color:red";

        document.getElementById('lastNameHelp').innerText = "Please enter your last name";
        document.getElementById('lastNameHelp').style.cssText = "color:red";
    }

    var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,20}$/;
    if (!passValue.match(passw)) {
        //alert("Not Valid pass");

        document.getElementById('confirmPasswordHelp').innerText = "Invalid Password";
        document.getElementById('confirmPasswordHelp').style.cssText = "color:red";

        document.getElementById('passwordHelp').innerText = "Invalid Password";
        document.getElementById('passwordHelp').style.cssText = "color:red";
    }

    alert("Form submitted. Your entered information: Email: " + emailValue + " First Name: " + firstNameValue + " Last Name: " + lastNameValue +
        " Event: " + eventOutput + " Instrument: " + selectedInstrument + " Part: " + partOutput + " Year: " + yearOutput);
}