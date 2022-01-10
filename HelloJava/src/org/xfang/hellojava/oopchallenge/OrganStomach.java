package org.xfang.hellojava.oopchallenge;

public class OrganStomach extends Organ {
    private boolean isDigesting;

    public OrganStomach(String name, String medicalCondition, String color, boolean isDigesting) {
        super(name, medicalCondition, color);
        this.isDigesting = isDigesting;
    }

    public void stomachOperations() {
        System.out.println("\t1. Digest");
        System.out.println("\t2. Quit");
    }

    public boolean isDigesting() {
        return isDigesting;
    }

    public void setDigesting(boolean digesting) {
        isDigesting = digesting;
        if (isDigesting) {
            System.out.println("Stomach is digesting");
        } else {
            System.out.println("Need to be fed");
        }
    }
}

