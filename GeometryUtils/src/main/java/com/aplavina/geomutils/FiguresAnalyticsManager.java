package com.aplavina.geomutils;

import com.aplavina.figures.Figure;

import java.util.List;

public class FiguresAnalyticsManager {
    public static void printAnalytics(List<Figure> figures) {
        System.out.println("There are " + figures.size() + " figures");
        System.out.println("Total area: " + figures.stream().mapToDouble(Figure::area).sum());
    }
}
