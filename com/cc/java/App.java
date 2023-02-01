package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Mitarbeiter mitarbeiter1=new Mitarbeiter(null, null, null, 0);

        output(mitarbeiter1.getProperties("#familyname"));
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

