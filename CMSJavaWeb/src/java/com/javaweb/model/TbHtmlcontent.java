package com.javaweb.model;
// Generated Nov 21, 2016 4:09:01 PM by Hibernate Tools 4.3.1



/**
 * TbHtmlcontent generated by hbm2java
 */
public class TbHtmlcontent  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String content;
     private String notes;
     private String position;

    public TbHtmlcontent() {
    }

    public TbHtmlcontent(String title, String content, String notes, String position) {
       this.title = title;
       this.content = content;
       this.notes = notes;
       this.position = position;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }




}


