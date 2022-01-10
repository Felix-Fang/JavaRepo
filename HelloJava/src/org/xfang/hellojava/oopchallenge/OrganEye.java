package org.xfang.hellojava.oopchallenge;

public class OrganEye extends Organ {
    private boolean isEyeClosed;

    public OrganEye(String name, String medicalCondition, String color, boolean isEysClosed) {
        super(name, medicalCondition, color);
        this.isEyeClosed = isEysClosed;
    }

    public void eyeOperations() {
        System.out.println("\t1. Closed the Eye");
        System.out.println("\t2. Quit");

    }

    public boolean isEyeClosed() {
        return isEyeClosed;
    }

    public void setEyeClosed(boolean eyeClosed) {
        isEyeClosed = eyeClosed;
    }

    public void closeEye() {
        if (isEyeClosed) {
            System.out.println(this.name + " was closed");
        } else {
            isEyeClosed = true;
            System.out.println(this.name + " is closed");
        }
    }

    public void openEye() {
        if (isEyeClosed) {
            isEyeClosed = false;
            System.out.println(this.name + " is open");
        } else {
            System.out.println(this.name + " was open");
        }
    }
}
