package com.teksystems.formbeans;

import com.teksystems.validation.EmailUnique;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
public class UsersFormBean {
    private Integer id;

    @NotEmpty(message = "First name is required.")
    private String firstName;
    @NotEmpty(message = "Last name is required.")
    private String lastName;

    @NotEmpty(message = "Email address is required.")
    @Length(max = 20, message = "Email cannot be longer than 20 characters.")
    @EmailUnique(message = "Email already exists")
    private String email;

    private Integer instrumentId;

    private Integer bandYear;

    private Integer musicPart;

    private String password;

    private String confirmPassword;

}
