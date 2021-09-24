package org.launchcode.secret_review.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private int role_id;

    private String name;

    @OneToMany(mappedBy = "role")
    private final List<User> users = new ArrayList<>();

    public Role(String name) {
        this.name = name;
    }

    public Role(){}

    public int getRole_id() {
        return role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return role_id == role.role_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role_id);
    }

}
