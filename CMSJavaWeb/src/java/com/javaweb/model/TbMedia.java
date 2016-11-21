package com.javaweb.model;
// Generated Nov 21, 2016 4:09:01 PM by Hibernate Tools 4.3.1



/**
 * TbMedia generated by hbm2java
 */
public class TbMedia  implements java.io.Serializable {


     private Integer id;
     private String images;
     private String title;
     private String alt;
     private String description;

    public TbMedia() {
    }

	
    public TbMedia(String images) {
        this.images = images;
    }
    public TbMedia(String images, String title, String alt, String description) {
       this.images = images;
       this.title = title;
       this.alt = alt;
       this.description = description;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getImages() {
        return this.images;
    }
    
    public void setImages(String images) {
        this.images = images;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAlt() {
        return this.alt;
    }
    
    public void setAlt(String alt) {
        this.alt = alt;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


