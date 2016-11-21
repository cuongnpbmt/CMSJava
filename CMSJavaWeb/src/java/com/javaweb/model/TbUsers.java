package com.javaweb.model;
// Generated Nov 21, 2016 8:56:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TbUsers generated by hbm2java
 */
public class TbUsers  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private String fullname;
     private String email;
     private String avatar;
     private String activationKey;
     private Integer status;
     private Date datecreated;
     private String note;

    public TbUsers() {
    }

	
    public TbUsers(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public TbUsers(String username, String password, String fullname, String email, String avatar, String activationKey, Integer status, Date datecreated, String note) {
       this.username = username;
       this.password = password;
       this.fullname = fullname;
       this.email = email;
       this.avatar = avatar;
       this.activationKey = activationKey;
       this.status = status;
       this.datecreated = datecreated;
       this.note = note;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getActivationKey() {
        return this.activationKey;
    }
    
    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getDatecreated() {
        return this.datecreated;
    }
    
    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


