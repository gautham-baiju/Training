package com.hehe.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //field injection
    @Qualifier("desktop")
    Computer comp;

//    Laptop laptop;
//    Dev(Laptop laptop) { // constructor injection
//        this.laptop = laptop;
//    }

//    Laptop laptop;
//    @Autowired
//    public void setLaptop(Laptop laptop) { // setter injection
//        this.laptop = laptop;
//    }

    public void build() {
        comp.compile();
        System.out.println("Lessgooooooo");
    }
}
