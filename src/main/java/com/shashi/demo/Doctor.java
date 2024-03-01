package com.shashi.demo;

public class Doctor implements Staff{
    private String Qualification;
    public  void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
