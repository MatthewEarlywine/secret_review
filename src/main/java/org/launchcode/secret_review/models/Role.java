package org.launchcode.secret_review.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue
    private int role_id;

    private String name;

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
}
