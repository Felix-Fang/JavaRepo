package org.xfang.hellojava.oopchallenge;

public class Organ {
    String name;
    String medicalCondition;
    String color;

    public Organ(String name, String medicalCondition, String color) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
