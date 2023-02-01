package com.cc.java;

public class Mitarbeiter {
    
    String familyName;
    String firstName;
    String role;
    int yearOfEntry;


    
public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }



public String getProperties (String op) {
    switch (op) {
        case "#familyname":
          return familyName;
        case "#firstName":
          return firstName;
        case "#role":
          return role;
        case "#yearOfEntry":
          return String.valueOf(yearOfEntry);
        default:
          return "ERROR!";
      }
    }
    

}




