package com.example.demo_buoi36_jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "users")
    private List<UsersRoles> usersRoles;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public List<UsersRoles> getUsersRoles() {
        return usersRoles;
    }

    public void setUsersRoles(List<UsersRoles> usersRoles) {
        this.usersRoles = usersRoles;
    }
}
