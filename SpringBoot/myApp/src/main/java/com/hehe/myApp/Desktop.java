package com.hehe.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements  Computer{
    public void compile() {
        System.out.println("Compilingggg... desktop");
    }
}
