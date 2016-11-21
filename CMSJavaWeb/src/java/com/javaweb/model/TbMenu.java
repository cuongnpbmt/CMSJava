package com.javaweb.model;
// Generated Nov 21, 2016 8:56:42 PM by Hibernate Tools 4.3.1



/**
 * TbMenu generated by hbm2java
 */
public class TbMenu  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private int parentid;
     private int type;
     private String link;
     private Integer newscategoryid;
     private String notes;

    public TbMenu() {
    }

	
    public TbMenu(String name, int parentid, int type) {
        this.name = name;
        this.parentid = parentid;
        this.type = type;
    }
    public TbMenu(String name, String description, int parentid, int type, String link, Integer newscategoryid, String notes) {
       this.name = name;
       this.description = description;
       this.parentid = parentid;
       this.type = type;
       this.link = link;
       this.newscategoryid = newscategoryid;
       this.notes = notes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getParentid() {
        return this.parentid;
    }
    
    public void setParentid(int parentid) {
        this.parentid = parentid;
    }
    public int getType() {
        return this.type;
    }
    
    public void setType(int type) {
        this.type = type;
    }
    public String getLink() {
        return this.link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }
    public Integer getNewscategoryid() {
        return this.newscategoryid;
    }
    
    public void setNewscategoryid(Integer newscategoryid) {
        this.newscategoryid = newscategoryid;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }




}


