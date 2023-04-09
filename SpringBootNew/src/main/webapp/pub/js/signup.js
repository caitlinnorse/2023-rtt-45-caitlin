

    <script>


        function cancelClicked() {
            //alert("Cancel Clicked");
            var items = document.querySelectorAll('.is-invalid');

            for (i in items) {
                console.log(i);
                let item = i;
                i.classList.remove("is-invalid");
            }


            let emailInput = document.getElementById('exampleInputEmail1');
            let emailValue =emailInput.value;

            let passInput = document.getElementById('password');
            let passValue = passInput.value;

            let confirmInput = document.getElementById('confirmPassword');
            let confirmValue = confirmInput.value;

            emailInput.classList.remove("is-invalid");
            emailInput.value = "";
            emailInput.style.backgroundColor = "white";

            passInput.classList.remove("is-invalid");
            passInput.value = "";
            passInput.style.backgroundColor = "white";

            confirmInput.classList.remove("is-invalid");
            confirmInput.value = "";
            confirmInput.style.backgroundColor = "white";


        }

        function formSubmit() {
            let emailInput = document.getElementById('exampleInputEmail1');
            let emailValue = emailInput.value;

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

            console.log(emailValue);

            if(emailValue == '') {
                //alert("Email is required.");
                // add the bootstrap class is-invalid to show an error
                emailInput.classList.add("is-invalid");
                // this will set the email input field to what ever text
                emailInput.value = "Enter your email";
                // now we can add an indvidual style to the input field
                emailInput.style.backgroundColor = "yellow";
                emailInput.style.cssText += "color:red";
            }

            var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,20}$/;
            if(!passValue.match(passw)) {
                //alert("Not Valid pass");

                document.getElementById('confirmPasswordHelp').innerText = "Invalid Password";
                document.getElementById('confirmPasswordHelp').style.cssText = "color:red";

                document.getElementById('passwordHelp').innerText = "Invalid Password";
                document.getElementById('passwordHelp').style.cssText = "color:red";
            }

            document.getElementById('emailHelp').innerText = "Please enter your email address";
            document.getElementById('emailHelp').style.cssText = "color:red";

        }
    </script>