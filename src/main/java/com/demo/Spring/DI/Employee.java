package com.demo.Spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Setter injection example
//The technologies class is being injected in the setter method setTechnologies
@Component
public class Employee {
    private int id;
    private String name;
    private Technologies technologies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Technologies getTechnologies() {
        return technologies;
    }
    //setter injection
    @Autowired
    public void setTechnologies(Technologies technologies) {
        this.technologies = technologies;
    }

    public void display(){
        System.out.println("in employee");
    }
}
