package org.launchcode.secret_review.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Role extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int role_id;

    private String name;

    @OneToMany(mappedBy = "role")
    private final List<User> users = new ArrayList<>();

    public Role(String name) {
        this.name = name;
    }

    public Role(){}

//    public int getRole_id() {
//        return role_id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

}
