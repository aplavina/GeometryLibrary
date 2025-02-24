package com.aplavina.threedemensional;

public class Sphere implements ThreeDemensionalFigure {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}
