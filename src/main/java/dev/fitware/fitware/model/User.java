package dev.fitware.fitware.model;

import jakarta.persistence.Entity;

@Entity
public class User {

    private String name;
    private String email;
    private String typeUser;
    private Boolean status;

    public User getUser(){
        return this;
    }

    public String getTypeUser(User user){
        return user.typeUser;
    }

    public Boolean getStatusUser(User user){
        return this.status;
    }
}
