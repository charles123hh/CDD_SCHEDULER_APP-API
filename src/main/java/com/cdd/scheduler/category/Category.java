package com.cdd.scheduler.category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long CategoryID;
    private String Description;

    public Category(){}

    public Category(Long categoryID){
        this.CategoryID = categoryID;
    }

    public Long getCategoryID(){
        return this.CategoryID;
    }
    public void setCategoryID(Long categoryID){
        this.CategoryID = categoryID;
    }

    public String getDescription(){
        return this.Description;
    }
    public void setDescription(String description){
        this.Description = description;
    }

}
