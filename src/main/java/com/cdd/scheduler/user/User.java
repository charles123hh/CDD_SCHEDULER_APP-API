package com.cdd.scheduler.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long UserID;
    private String Username;
    private String Password;

    public User(){}

    public User(Long userID){
        this.UserID = userID;
    }

    public Long getUserID(){
        return this.UserID;
    }
    public void setUserID(Long userID){
        this.UserID = userID;
    }

    public String getUsername(){
        return this.Username;
    }
    public void setUsername(String username){
        this.Username = username;
    }

    public String getPassword(){
        return this.Password;
    }
    public void setPassword(String password){
        this.Password = password;
    }

}
