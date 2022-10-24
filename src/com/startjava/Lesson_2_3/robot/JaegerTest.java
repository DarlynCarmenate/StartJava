package com.startjava.Lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();

        jaeger1.setModelName("ChernoAlpha");
        jaeger1.setMark("mark-1");
        jaeger1.setHeight(85.34f);
        jaeger1.setWeight(2.412f);
        jaeger1.setStrength(10);
        jaeger1.setArmor(10);

        Jaeger jaeger2 = new Jaeger("Jipsy Danger", "mark-3", 79.25f, 1.980f, 8, 6);
        jaeger2.useVortexCannon();
        System.out.println(jaeger1.scanKaiju());

        System.out.println("Jaeger's 1 name: " + jaeger1.getModelName() + "\nJaeger's 2 name is: "
                + jaeger2.getModelName());
        jaeger2.setHeight(90.60f);
        System.out.println("Jaeger's 1 height is: " + jaeger1.getHeight() + "\nJaeger's 2 new height: "
                + jaeger2.getHeight());
        jaeger1.setArmor(12);
        System.out.println("Jaeger's total armor is from " + jaeger2.getArmor() + " to " + 
                jaeger1.getArmor());
        jaeger1.move();
        
    }
}