package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double sixth = Math.sqrt(fifth);
        return sixth;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(3, 7, 8, 12);
        System.out.println("Result (3, 7) to (8, 12) " + result);
        result = Point.distance(2, 0, 7, 2);
        System.out.println("Result (2, 0) to (7, 2) " + result);
    }

}
