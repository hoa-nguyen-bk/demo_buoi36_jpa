package com.example.demo_buoi36_jpa.entity.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UsersRolesId implements Serializable {
    @Column(name = "roles_id")
    private int rolesId;

    @Column(name = "users_id")
    private int usersId;

    public UsersRolesId(int rolesId,int usersId){
        this.rolesId=rolesId;
        this.usersId=usersId;
    }
    public UsersRolesId(){}

    public int getRolesId() {
        return rolesId;
    }

    public void setRolesId(int rolesId) {
        this.rolesId = rolesId;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }
}
