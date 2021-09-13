package org.launchcode.secret_review.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends AbstractEntity{

    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}