<jsp:include page="include/header.jsp" />
    <section class="pt-5 pb-5" style="background-color: rgb(218, 225, 234);">
        <div class="container text-center">
            <h2>Create a New Account</h2>
        </div>
    </section>

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

    <section class="pt-5 pb-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-sm-12 col-md-7 col-xl-5">


                    <form>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input type="text" class="form-control" id="exampleInputEmail1"
                                aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                        </div>
                        <div class="mb-3">
                            <label for="name" class="form-label" id="name" aria-describedby="nameHelp">Name</label>
                            <input type="text" class="form-control" id="nameHelp">
                            <div id="emailHelp" class="form-text">Let us know who you are.</div>

                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label" id="passwordLabel"
                                aria-describedby="passwordHelp">Password</label>
                            <input type="password" class="form-control" id="password">
                            <div id="passwordHelp" class="form-text">Minimum 8 Characters with an uppercase, lowercase, and
                                a
                                number.</div>
                        </div>
                        <div class="mb-3">
                            <label for="confirmPassword" class="form-label" id="confirmPasswordLabel"
                                aria-describedby="confirmPasswordHelp">Confirm Password</label>
                            <input type="password" class="form-control" id="confirmPassword">
                            <div id="confirmPasswordHelp" class="form-text">Re-enter Password.</div>
                        </div>
                        <button type="button" id="create_btn" class=" btn btn-primary mt-3 me-3"  onclick="formSubmit()">Create Account</button>
                        <button type="button" class="btn btn-secondary mt-3" onclick="cancelClicked()">Cancel</button>
                    </form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="include/footer.jsp" />