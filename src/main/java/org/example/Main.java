package org.example;

public class Main {

    public static void main(String[] args) {

    }

    // 1) Barking dog
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;


        return (clock >= 20 || clock <= 7);
    }

    // 2) Age verification
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    // 3) Playful cat
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        }
        return temp >= 25 && temp <= 35;
    }

    // 4) Area calculator for rectangular
    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    // 4) Area calculator for circle
    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }
}
