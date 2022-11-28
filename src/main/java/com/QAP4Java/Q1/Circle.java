package com.QAP4Java.Q1;

public class Circle extends Shape implements Scalable{
        private double radius;
        private String name;

        public Circle (){
            this.radius = 1.0;
        }

        public Circle (double radius){
            this.radius = radius;
        }


        public Circle (double radius, String color, boolean filled, String name){
            super(color, filled, name);
            this.radius = radius;
            this.name = "Circle";
        }
        public double getRadius(){
            return radius;
        }
        public String getName() {return name;}

    @Override
    double getArea() {
        double area = Math.PI*radius*radius;
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public void setRadius(double radius) {
            this.radius = radius;
        }
        public void setName(String name) {this.name = name;}
        public boolean FILLED() {
            return super.FILLED();
        }

        public String toString() {return "A Circle with radius = " + radius +", which is a subclass of " + super.toString();
        }

    @Override
    public void scaleUp(double inc) {
        double percent = inc/100;
        double newValue = getRadius()*(1+percent);
        setRadius(newValue);
    }

    @Override
    public void scaleDn(double dec) {
        double percent = dec/100;
        double newValue = getRadius()*(1-percent);
        setRadius(newValue);
    }
}

