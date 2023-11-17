package com.monikaproject.login;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

    @Entity
    public class Student {
    @Id
    private String emailId;
    private String name;
    private Long mobileNumber;

    Student(String name, String emailId){
        this.name = name;
        this.emailId = emailId;
    }

    Student(String name, Long mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    Student(String name, String emailId, long mobileNumber){
        this.name = name;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
    }


    //getters
    public String getName(){
        return this.name;
    }

    public String getEmailId(){
        return this.emailId;
    }

    public Long getMobileNumber(){
        return this.mobileNumber;
    }

    //setters


    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
