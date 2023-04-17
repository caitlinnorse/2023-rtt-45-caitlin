package springframework.formbeans;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@ToString
@Getter
@Setter
public class CreateUserFormBean {
    //@NotNull is false if null but it also true if ""
    // NotEmpty is

    private String email;
    private String fullName;
    private String password;
    private String confirmPassword;
}
