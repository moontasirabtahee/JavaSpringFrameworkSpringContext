package com.abtahee;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
        public Desktop() {
            System.out.println("Desktop Class constructed");
        }

    @Override
    public void compile() {
        System.out.println("Desktop is compiling the code");
    }
}
