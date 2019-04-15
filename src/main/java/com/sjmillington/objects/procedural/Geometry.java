package com.sjmillington.objects.procedural;

public class Geometry {

    public final double PI = 3.1415;

    public double area(Object shape){
        if(shape instanceof Square){
            Square s = (Square)shape;
            return s.side * s.side;
        }else if(shape instanceof Circle){
            Circle c = (Circle)shape;
            return PI * c.radius * c.radius;
        }

        return 0;
    }
}
