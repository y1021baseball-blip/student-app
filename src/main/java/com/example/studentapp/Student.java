package com.example.studentapp;

public class Student {
    private String name;
    private int japanese;
    private int math;
    private int english;
    private int science;
    private int social;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJapanese(){
        return japanese;
    }
    public void setJapanese(int japanese){
        this.japanese = japanese;
    }


    public int getMath(){
        return math;
    }
    public void setMath(int math){
        this.math = math;
    }
    
    public int getEnglish(){
        return english;
    }
    public void setEnglish(int english){
        this.english = english;
    }

    public int getScience(){
        return science;
    }
    public void setScience(int science){
        this.science = science;
    }
    public int getSocial(){
        return social;
    }
    public void setSocial(int social){
        this.social = social;
    }

    public double getAverage(){
        return(japanese +math + english +science+ social)/5.0;
    }
}