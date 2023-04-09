package springframework.formbeans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class CreateUserFormBean {
    private String email;
    private String fullName;
    private String password;
    private String confirmPassword;
}
