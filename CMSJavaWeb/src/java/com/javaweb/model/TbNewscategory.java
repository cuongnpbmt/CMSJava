package com.javaweb.model;
// Generated Nov 21, 2016 4:09:01 PM by Hibernate Tools 4.3.1



/**
 * TbNewsCategory generated by hbm2java
 */
public class TbNewsCategory  implements java.io.Serializable {


     private Integer id;
     private int idnews;
     private int idcategory;
     private String note;

    public TbNewsCategory() {
    }

	
    public TbNewsCategory(int idnews, int idcategory) {
        this.idnews = idnews;
        this.idcategory = idcategory;
    }
    public TbNewsCategory(int idnews, int idcategory, String note) {
       this.idnews = idnews;
       this.idcategory = idcategory;
       this.note = note;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getIdnews() {
        return this.idnews;
    }
    
    public void setIdnews(int idnews) {
        this.idnews = idnews;
    }
    public int getIdcategory() {
        return this.idcategory;
    }
    
    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


