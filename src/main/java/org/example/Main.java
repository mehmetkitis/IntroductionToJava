package org.example;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);

        area(5.0, 4.0);
        area(-1.0, 4.0);
        area(5.0);
        area(-1);
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock >= 20 || clock < 8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(temp <=25 ){
            System.out.println("false");
            return false;
        } else if (isSummer && temp>45) {
            System.out.println("false");
            return false;
        } else if (!isSummer && temp>35) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0){
            System.out.println(-1);
            return -1;
        }else {
            System.out.println(width * height);
            return width * height;
        }
    }

    public static double area(double radius) {
        if(radius < 0){
            System.out.println(-1);
            return -1;
        }else{
            System.out.println(radius*radius* Math.PI);
            return radius*radius* Math.PI;
        }
    }
}
