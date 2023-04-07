package com.teksystems.formbeans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UsersFormBean {
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String instrument;

    private Integer bandYear;

    private Integer musicPart;

    private  String password;

    private Integer instrumentId;

}
