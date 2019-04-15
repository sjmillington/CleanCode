package com.sjmillington.objects.polymorphic;

import java.awt.*;

public class Circle implements Shape {

    private Point center;
    private double radius;
    private final double PI = 3.1415;

    @Override
    public double area() {
        return PI*radius*radius;
    }
}
