package com.QAP4Java.Q1;

public class EquilateralTriangle extends Triangle{


    public EquilateralTriangle(double sideA, double sideB, double sideC, String name) {
        super(sideA, sideB, sideC, name);

    }

    public EquilateralTriangle(double sideA, double sideB, double sideC, String color, boolean filled, String name) {
        super(sideA, sideB, sideC, color, filled, name);
        testSides(sideA, sideB, sideC);
    }

    public void testSides(double sideA, double sideB, double sideC){
        if ((sideA == sideB) && (sideA == sideC)) {super.setName("Equilateral Triangle");}


    }

//    public EquilateralTriangle(double sideA, double sideB, double sideC, String color, boolean filled, String name){
//        super(sideA,sideB,sideC,color, filled);
//
//        testSides(sideA,sideB,sideC);
//       }


    double getArea(){
        return super.getArea();
    }

    double getPerimeter(){
        return super.getPerimeter();
    }

    public String toString() {
        return "A "+ super.getName() + "with Sides, " + getSideA() + getSideB()+ getSideC() + ", which is a subclass of " + super.toString();
    }


}



