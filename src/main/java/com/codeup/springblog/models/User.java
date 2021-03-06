package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="user")
public class User {
    // create fields for id, username, email, and password.

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false)
        private String firstname;

        @Column(nullable = false)
        private String lastname;

        @Column(nullable = false, unique = true) // unique = true --> this allows a user to sign up with one username
        private String username;

        @Column(nullable = false, unique = true) // unique = true --> this allows a user to sign up with one email
        private String email;

        @Column(nullable = false)
        private String password;

        @OneToMany(mappedBy = "user")
        private List<Post> posts;

        public User(){
        }

    public User(User copy) {
        this.id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        this.email = copy.email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = copy.username;
        this.password = copy.password;
    }

    public User(String firstname, String lastname, String username, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(long id, String firstname, String lastname, String username, String email, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    //        @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
//        private List<PostImage> imagers;

}
