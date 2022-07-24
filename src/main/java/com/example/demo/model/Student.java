package com.example.demo.model;
import lombok.Data;
import java.io.Serializable;

@Data
public class Student implements Serializable {
   private   int id;
   private String name;
   private Integer spassword;


//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getSpassword() {
//        return spassword;
//    }
//
//    public void setSpassword(Integer spassword) {
//        this.spassword = spassword;
//    }
}
