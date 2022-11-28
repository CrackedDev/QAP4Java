package com.QAP4Java.Q1;

abstract class Shape implements Scalable{
    private String color;
    private boolean filled;

    private String name;

    public Shape(){
        this.color = "red";
        this.filled = true;
        this.name = "Shape";
    }
    public Shape(String color, boolean filled, String name){
        this.color = color;
        this.filled = filled;
        this.name = name;
    }

    public String getColor(){
        return color;
    }
    public boolean FILLED(){
        return filled;
    }
    public String getName() {return name;}

    abstract double getArea();
    abstract double getPerimeter();

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void setName(String name){this.name = name;}
    public String toString() {return "A "+ name + "with color of " + color + " and filled = " + filled;
    }
}


