package com.aplavina.figures;

public class Square implements Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double area() {
        return side * side;
    }
}
