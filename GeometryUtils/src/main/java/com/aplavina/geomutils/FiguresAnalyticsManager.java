package com.aplavina.geomutils;

import com.aplavina.figures.Figure;

import java.util.List;

public class FiguresAnalyticsManager {
    public static void printAnalytics(List<Figure> figures) {
        System.out.println("There are " + figures.size() + " figures");
    }
}
