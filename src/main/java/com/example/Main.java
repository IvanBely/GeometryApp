package com.example;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;
import com.example.geometryutils.GeometryUtils;
import com.example.threedimensionalshapes.Cube;
import com.example.threedimensionalshapes.Sphere;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        double areaInSquareMeters = rectangle.getArea();
        double areaInSquareFeet = GeometryUtils.convertSquareMetersToSquareFeet(areaInSquareMeters);
        System.out.println("Area in square feet: " + areaInSquareFeet);

        Cube cube = new Cube(3.0);
        Sphere sphere = new Sphere(4.0);

        System.out.println("Cube volume: " + cube.getVolume());
        System.out.println("Cube surface area: " + cube.getSurfaceArea());

        System.out.println("Sphere volume: " + sphere.getVolume());
        System.out.println("Sphere surface area: " + sphere.getSurfaceArea());
    }
}