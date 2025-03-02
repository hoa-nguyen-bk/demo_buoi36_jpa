package com.example.demo_buoi36_jpa.entity;

import com.example.demo_buoi36_jpa.entity.keys.UsersRolesId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "users_roles")
public class UsersRoles {
    @EmbeddedId
    private UsersRolesId id;

    @ManyToOne
    @JoinColumn(name="roles_id", insertable = false, updatable = false)
    private Roles roles;

    @ManyToOne
    @JoinColumn(name="users_id", insertable = false, updatable = false)
    private Users users;

    public UsersRolesId getId() {
        return id;
    }

    public void setId(UsersRolesId id) {
        this.id = id;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
