package org.xfang.oopchallenge;

public class OrganHeart extends Organ {

    private int heartRate;

    public OrganHeart(String name, String medicalCondition, String color, int heartRate) {
        super(name, medicalCondition, color);
        this.heartRate = heartRate;
    }

    public void heartOperations() {
        System.out.println("\t1. Change the heart rate");
        System.out.println("\t2. Quit");

    }

    public int getHeartRate() {
        return heartRate;
    }


    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        System.out.println("Heart rate changed to: " + this.heartRate);
    }
}
