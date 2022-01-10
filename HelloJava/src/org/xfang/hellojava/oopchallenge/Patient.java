package org.xfang.hellojava.oopchallenge;

public class Patient {
    String name;
    int age;
    OrganEye leftEye;
    OrganEye rightEye;
    OrganHeart heart;
    OrganStomach stomach;
    OrganSkin skin;

    public Patient(String name, int age, OrganEye leftEye, OrganEye rightEye, OrganHeart heart, OrganStomach stomach, OrganSkin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public OrganEye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(OrganEye leftEye) {
        this.leftEye = leftEye;
    }

    public OrganEye getRightEye() {
        return rightEye;
    }

    public void setRightEye(OrganEye rightEye) {
        this.rightEye = rightEye;
    }

    public OrganHeart getHeart() {
        return heart;
    }

    public void setHeart(OrganHeart heart) {
        this.heart = heart;
    }

    public OrganStomach getStomach() {
        return stomach;
    }

    public void setStomach(OrganStomach stomach) {
        this.stomach = stomach;
    }

    public OrganSkin getSkin() {
        return skin;
    }

    public void setSkin(OrganSkin skin) {
        this.skin = skin;
    }
}
