package com.abtahee;

import AppConfig.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//        // XML Based Configuration where beans are used as XML tag
//        ApplicationContext context = new ClassPathXmlApplicationContext("XMLBasedConfiguration.XML");
//        Alien alien = context.getBean("alien", Alien.class);
//        alien.code();

          // AppConfigWith JavaConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien alien = context.getBean(Alien.class);
        alien.code();
    }
}
