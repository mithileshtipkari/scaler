package com.scaler.intermediate.dsa.ClassesAndObjects;

public class Gym {
    String name;
    int noOfMembers;

    public static void main(String[] args) {
        Gym g;
        //System.out.println(g.name);//might not have been initialized

        Gym beta = null;
        System.out.println("name -" + beta.name);//NPE
    }
}
