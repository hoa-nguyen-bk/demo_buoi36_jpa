package com.example.demo_buoi36_jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "roles")
    private List<UsersRoles> usersRoles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UsersRoles> getUsersRoles() {
        return usersRoles;
    }

    public void setUsersRoles(List<UsersRoles> usersRoles) {
        this.usersRoles = usersRoles;
    }
}
