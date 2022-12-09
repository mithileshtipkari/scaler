package com.scaler.intermediate.dsa.ClassesAndObjects;
//calculate sum of areas of rectangles which are not squares
//length and breadths given in arrays
public class RectangleSolution {
    public static void main(String[] args) {
        calculateArea();
    }

    public static int calculateArea(){
        int[] l = new int[]{2, 3, 4, 1, 5};
        int[] b = new int[]{1, 3, 3, 1, 6};

        int sum = 0;
        for(int i = 0; i < l.length; i++){
            Rectangle r = new Rectangle(l[i], b[i]);
            if(!r.isSquare()){
                sum += r.area();
            }
        }
//        System.out.println("area sum - " + sum);
        return sum;
    }

}

class Rectangle{
    int l;
    int b;

    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    int area(){
        return l * b;
    }

    boolean isSquare(){
        return l == b;
    }
}
