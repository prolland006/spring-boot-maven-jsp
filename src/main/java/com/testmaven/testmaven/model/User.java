package com.testmaven.testmaven.model;


public class User {
    // form:hidden - hidden value
    Integer id;

    // form:input - textbox
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name ;
    }

}
