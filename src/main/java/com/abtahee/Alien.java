package com.abtahee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("21")
    private int age;
    @Autowired
    @Qualifier("desktop")
    public Computer computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien() {
        System.out.println("Alien Class Contructed !");
    }
    public void code(){
        System.out.println(age);
        System.out.println("Alien is Coding");
        System.out.println("------Compiling------");
        computer.compile();
        System.out.println("------compiled------");

    }
}
