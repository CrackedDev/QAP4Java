package com.QAP4Java.Q1;

public class Triangle extends Shape implements Scalable {
    private double sideA;
    private double sideB;
    private double sideC;
    private String name;


    public Triangle(double sideA, double sideB, double sideC, String name) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled, String name) {
        super(color, filled, name);
        if (!((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideC + sideA) > sideB)) {
            throw new IllegalArgumentException("Shape is not a Triangle!!");
        }
        this.name = "Triangle";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }


    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    double getArea() {
        double S = (sideA + sideB + sideC)/2;
        double area = Math.sqrt(S * ((S - sideA) * (S - sideB) * (S - sideC)));
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
    public String toString() {return "A "+ name + "with Sides, " + sideA + sideB+ sideC + ", which is a subclass of " + super.toString();
    }

    @Override
    public void scaleUp(double inc) {
        double percent = inc/100;
        double newSideA = getSideA()*(1+percent);
        double newSideB = getSideB()*(1+percent);
        double newSideC = getSideC()*(1+percent);
        setSideA(newSideA);
        setSideB(newSideB);
        setSideC(newSideC);
    }

    @Override
    public void scaleDn(double dec) {
        double percent = dec/100;
        double newSideA = getSideA()*(1-percent);
        double newSideB = getSideB()*(1-percent);
        double newSideC = getSideC()*(1-percent);
        setSideA(newSideA);
        setSideB(newSideB);
        setSideC(newSideC);
    }
}
