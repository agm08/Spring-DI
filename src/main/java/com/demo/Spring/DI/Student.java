package com.demo.Spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//		This is field injection since the dependency of technology object is injected directly into the Student class.
@Component
public class Student {
    private int id;
    private String first_name;
    private String last_name;
    //The field injection is done here with the @autowired tag
    @Autowired
    private Technologies techDetails;

    public Technologies getTechDetails() {
        return techDetails;
    }

    public void setTechDetails(Technologies techDetails) {
        this.techDetails = techDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void display(){
        System.out.println("Object returned successfully");
        techDetails.tech();
    }
}
