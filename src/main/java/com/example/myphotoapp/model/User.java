package com.example.myphotoapp.model;

public class User {
    private int userID;
    private String name;
    private String address;
    private int age;

    public User( String name, String address,  int age){
        this.name=name;
        this.address= address;
        this.age= age;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
