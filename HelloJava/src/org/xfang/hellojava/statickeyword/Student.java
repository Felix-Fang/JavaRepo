package org.xfang.hellojava.statickeyword;

public class Student {

    public static String name; // static variable in italic.
    public String newName;
    public int age;
    public String skinColor;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Student(String newName, int age, String skinColor) {
        this.newName = newName;
        this.age = age;
        this.skinColor = skinColor;


    }
}
