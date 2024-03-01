package com.shashi.demo;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public  void assist(){
        System.out.println("Doctor is assisting");
    }


}
