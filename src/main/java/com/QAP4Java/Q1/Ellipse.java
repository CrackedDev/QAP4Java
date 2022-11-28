package com.QAP4Java.Q1;

public class Ellipse extends Shape implements Scalable {
    private double majAxis;
    private double minAxis;

    public Ellipse(){
        this.majAxis = 2;
        this.minAxis = 1;
    }

    public Ellipse(double majAxis, double minAxis){
        this.majAxis = majAxis;
        this.minAxis = minAxis;
    }

    public Ellipse(double majAxis, double minAxis, String color, boolean filled, String name){
        super(color, filled, name);
        this.majAxis = majAxis;
        this.minAxis = minAxis;
    }

    public double getMajAxis(){return majAxis;}
    public double getMinAxis(){return minAxis;}
    public void setMajAxis(double majAxis){this.majAxis = majAxis;}
    public void setMinAxis(double minAxis){this.minAxis = minAxis;}
    @Override
    double getArea(){
        double area = Math.PI*majAxis*minAxis;
        return area;
    }
    @Override
    double getPerimeter(){
        double perimeter = Math.PI*(Math.sqrt((2*(((majAxis*majAxis)+(minAxis*minAxis)-((majAxis-minAxis)*(majAxis-minAxis)/2))))));
        return perimeter;
    }
    public String toString() {return "An Ellipse with a Major Axis of " + majAxis + " and a Minor Axis of " + minAxis + " which is a subclass of " + super.toString();
    }

    @Override
    public void scaleUp(double inc) {
        double percent = inc/100;
        double newMajAxis = getMajAxis()*(1+percent);
        double newMinAxis = getMinAxis()*(1+percent);
        setMajAxis(newMajAxis);
        setMinAxis(newMinAxis);

    }

    @Override
    public void scaleDn(double dec) {
        double percent = dec/100;
        double newMajAxis = getMajAxis()*(1-percent);
        double newMinAxis = getMinAxis()*(1-percent);
        setMajAxis(newMajAxis);
        setMinAxis(newMinAxis);
    }
}
