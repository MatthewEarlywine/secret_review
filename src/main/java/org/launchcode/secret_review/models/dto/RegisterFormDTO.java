package org.launchcode.secret_review.models.dto;

import org.launchcode.secret_review.models.Role;

import java.util.Set;

public class RegisterFormDTO extends LoginFormDTO {

    private Set<Role> roles;

    private String verifyPassword;

    private boolean enabled;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
