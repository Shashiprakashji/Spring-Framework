package com.shashi.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor=context.getBean(Doctor.class);
//        Nurse doctor=context.getBean(Nurse.class);
        Staff staff=context.getBean(Doctor.class);
        staff.assist();
    }
}
