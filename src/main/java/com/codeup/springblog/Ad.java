package com.codeup.springblog;


import javax.persistence.*;

@Entity
//@Table(name = "springAds") //this makes another table
public class Ad { // this is used to add to the database in mysql a  table name ads--if table isn't given another
    // name java takes the name of the class and assigns it as the name of the table

    @Id // id of the table in database spring_adlister_db
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;  //set the filed for the id
    //move on down to make more fields
    @Column(nullable = false, length = 50) // not null length 100?
    private String title;

    @Column(nullable = false) // not null...no other customization
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
