package com.example.studentapp;
import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private Integer japanese;
    private Integer math;
    private Integer english;
    private Integer science;
    private Integer social;

    public Student() {
    }

    public Long getId() {
    return id;
    }

    public void setId(Long id) {
    this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJapanese(){
        return japanese;
    }
    public void setJapanese(Integer japanese){
        this.japanese = japanese;
    }


    public Integer getMath(){
        return math;
    }
    public void setMath(Integer math){
        this.math = math;
    }
    
    public Integer getEnglish(){
        return english;
    }
    public void setEnglish(Integer english){
        this.english = english;
    }

    public Integer getScience(){
        return science;
    }
    public void setScience(Integer science){
        this.science = science;
    }
    public Integer getSocial(){
        return social;
    }
    public void setSocial(Integer social){
        this.social = social;
    }

    public double getAverage(){
    int j = (japanese != null) ? japanese : 0;
    int m = (math != null) ? math : 0;
    int e = (english != null) ? english : 0;
    int s = (science != null) ? science : 0;
    int so = (social != null) ? social : 0;

    return (j + m + e + s + so) / 5.0;
    }
}