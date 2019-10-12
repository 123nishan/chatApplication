package com.example.chatapplication.Model;

public class User {
    private String id;
    private String Email;
    private String imageURL;

    public User(String id, String email, String imageURL) {
        this.id = id;
        this.Email = email;
        this.imageURL = imageURL;
    }
    public User(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
