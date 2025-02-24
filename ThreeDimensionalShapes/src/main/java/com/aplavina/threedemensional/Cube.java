package com.aplavina.threedemensional;

public class Cube implements ThreeDemensionalFigure {
    private final double width;
    private final double height;
    private final double depth;

    public Cube(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    @Override
    public double volume() {
        return width * height * depth;
    }
}
