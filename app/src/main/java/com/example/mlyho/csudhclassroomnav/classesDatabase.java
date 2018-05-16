package com.example.mlyho.csudhclassroomnav;

public class classesDatabase {

    public String className, location;

    public classesDatabase(){

    }


    public classesDatabase(String className, String location) {
        this.className = className;
        this.location = location;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
