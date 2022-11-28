package com.QAP4Java.Q1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Circle c1 = new Circle(4, "red", false, "Circle");
        Ellipse e1 = new Ellipse(4, 3, "blue", true, "Ellipse");
        Triangle t1 = new Triangle(4, 5, 8, "green", true, "Triangle");
        EquilateralTriangle et1 = new EquilateralTriangle(5,5,5, "Orange", false, "Equilateral Triangle");

        List<Shape> shapes = new ArrayList<>();

        shapes.add(c1);
        shapes.add(e1);
        shapes.add(t1);
        shapes.add(et1);

        for(Shape s : shapes){

            System.out.println(String.format("%s" + " with a perimeter of: " + "%.2f" + " and an area of " + "%.2f",s.getName(),s.getPerimeter(), s.getArea()));
        }
        System.out.println();
        for(Shape s : shapes) {
            double scale = 25.5;
            s.scaleUp(scale);
            System.out.println("Scaled up by: " + scale);
            System.out.println(String.format("%s" + " with a perimeter of: " + "%.2f" + " and an area of " + "%.2f",s.getName(),s.getPerimeter(), s.getArea()));
        }
        System.out.println();
        for(Shape s : shapes) {
            double scale = 40;
            s.scaleDn(scale);
            System.out.println("Scaled Down by: " + scale);
            System.out.println(String.format("%s" + " with a perimeter of: " + "%.2f" + " and an area of " + "%.2f",s.getName(),s.getPerimeter(), s.getArea()));
        }

        }

    }

