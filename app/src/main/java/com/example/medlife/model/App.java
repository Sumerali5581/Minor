package com.example.medlife.model;

public class App
{
    private String username;
    private String name;
    private int age;
    private String phone;
    private String city;
    private String pass;

    public App(String username, String name, int age, String phone, String city, String pass) {
        this.username = username;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.city = city;
        this.pass = pass;
    }
    public App( String name, int age, String phone, String city, String pass) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.city = city;
        this.pass = pass;
    }
    public App()
    {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
