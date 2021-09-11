package org.launchcode.secret_review.models.dto;

import com.sun.istack.NotNull;
import org.launchcode.secret_review.models.Role;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid username. Must be between 3 and 30 characters.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 20, message = "Invalid password. Must be between 5 and 30 characters.")
    private String password;

    private Set<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRole(Set<Role> roles) {
        this.roles = roles;
    }
}
