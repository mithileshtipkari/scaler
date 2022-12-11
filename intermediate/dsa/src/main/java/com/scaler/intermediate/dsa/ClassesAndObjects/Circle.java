package com.scaler.intermediate.dsa.ClassesAndObjects;

public class Circle {
    // Define properties here
    int r;


    // Define constructor here
    Circle(int r){
        this.r = r;
    }


    float perimeter(){
        return 2*3.14f*r;
    }

    float area(){
        return 3.14f*r*r;
    }
}
