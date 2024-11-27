package com.abtahee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop Class Constructed");
    }
    @Override
    public void compile(){
        System.out.println("Laptop in compiling the code");
    }
}
