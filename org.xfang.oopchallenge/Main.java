package org.xfang.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean notQuit = true;
        String patientName;
        int patientAge;


        int optionNumber;

//        // OrganEye Test
//        OrganEye left_Eye = new OrganEye("Left Eye", "Healthy", "black",false);
//        System.out.println(left_Eye.isEyeClosed());
//
//        left_Eye.closeEye();
//        left_Eye.closeEye();
//        left_Eye.openEye();
//        left_Eye.openEye();
//
//        // OrganHeart Test
//        OrganHeart heart = new OrganHeart("Heart", "Healthy","red", 65);
//        System.out.println(heart.getHeartRate());
//        heart.setHeartRate(90);
//        System.out.println(heart.getHeartRate());

        System.out.print("Please enter patient's name: ");
        Scanner scanner = new Scanner(System.in);
        patientName = scanner.nextLine();

        System.out.print("Please enter patient's Age: ");
        patientAge = scanner.nextInt();

        //Todo: initialization method is wrong.
        OrganEye leftEye = new OrganEye("Left Eye", "Normal", "Black", false);
        OrganEye rightEye = new OrganEye("Right Eye", "Normal", "Black", false);
        OrganHeart heart = new OrganHeart("Heart", "Healthy", "N/A", 60);
        OrganStomach stomach = new OrganStomach("Stomach", "Normal", "N/A", false);
        OrganSkin skin = new OrganSkin("Skin", "Healthy", "White");

        Patient patient = new Patient(patientName, patientAge, leftEye, rightEye, heart, stomach, skin);
        System.out.println("Patient's Name: " + patient.name);
        System.out.println("Patient's Age: " + patient.age);

        while (notQuit) {
            printOrganOptions();
            switch (optionPrompt()) {
                case 1 -> {
                    organStatus(patient.leftEye);
                    System.out.println(patient.leftEye.color);
                    while (notQuit) {
                        patient.leftEye.eyeOperations();
                        switch (optionPrompt()) {
                            case 1 -> patient.leftEye.closeEye();
                            case 2 -> notQuit = false;
                        }
                    }
                    notQuit = true;
                }

                case 2 -> {
                    organStatus(patient.rightEye);
                    System.out.println(patient.rightEye.color);

                    while (notQuit) {
                        patient.rightEye.eyeOperations();
                        switch (optionPrompt()) {
                            case 1 -> patient.rightEye.closeEye();
                            case 2 -> notQuit = false;
                        }
                    }
                    notQuit = true;
                }
                case 3 -> {
                    organStatus(patient.heart);
                    System.out.println(patient.heart.getHeartRate());

                    while (notQuit) {
                        patient.heart.heartOperations();
                        switch (optionPrompt()) {
                            case 1 -> {
                                System.out.println("Please enter the new heart rate(50-200): ");
                                patient.heart.setHeartRate(scanner.nextInt());
                            }
                            case 2 -> notQuit = false;
                        }
                    }
                    notQuit = true;

                }
                case 4 -> {
                    organStatus(patient.stomach);
                    if (patient.stomach.isDigesting()) {
                        System.out.println("Stomach is digesting");
                    } else {
                        System.out.println("Need to be fed");
                    }
                    while (notQuit) {
                        patient.stomach.stomachOperations();
                        switch (optionPrompt()) {
                            case 1 -> {
                                patient.stomach.setDigesting(true);

                            }
                            case 2 -> notQuit = false;
                        }
                    }
                    notQuit = true;
                }

                case 5 -> organStatus(skin);

                case 6 -> {
                    System.out.println("System quit, see you next time");
                    notQuit = false;
                }
                default -> System.out.println("Warning: wrong number.");
            }

        }


    }

    public static void printOrganOptions() {
        System.out.println("Choose an Organ:");
        System.out.println("1. Left Eye");
        System.out.println("2. Right Eye");
        System.out.println("3. Heart");
        System.out.println("4. Stomach");
        System.out.println("5. Skin");
        System.out.println("6. Quit");
    }

    public static void organStatus(Organ patientOrgan) {
        System.out.println("Name: " + patientOrgan.name);
        System.out.println("Medical Condition: " + patientOrgan.medicalCondition);
    }

    public static int optionPrompt() {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
