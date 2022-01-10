package org.xfang.hellojava.collections;

import java.util.*;

public class Main_collections {
    public static void main(String[] args) {


//        String[] names = {"Meisam", "Sarah", "Brad", "Nadekube", "Tome"};
//        System.out.println(names[2]);
//
//        //names[5] = "Jerry"; //array length is unchangeable.
//
//        String[] newNames = new String[6];
//        for (int i=0; i<names.length; i++){
//            newNames[i] = names[i];
//        }
//        newNames[5] = "Jerry";
//        System.out.println(newNames[5]);

//        // Array List is mutable.
//        ArrayList<String> names = new ArrayList<>();
//        List<String> students = new ArrayList<>();
//
//        names.add("Meisam");
//        names.add("Sarah");
//        names.add("Jim");
//        names.add("Jack");
//        System.out.println(names.get(0));
//        System.out.println(names.size());
//
//        names.remove("Meisam");
//        System.out.println(names.get(0));
//        System.out.println(names.contains("Meisam"));
//
//        System.out.println(names.indexOf("Sarah"));
//
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(10);
//        intList.add(5);
//        intList.add(3);
//
//        System.out.println(intList.get(0));
//        System.out.println(intList);
//
//        ArrayList<Double> doubleList = new ArrayList<>();
//
//        for (int i = 0; i < names.size(); i++){
//            System.out.print(names.get(i) + " ");
//        }

//        Map<String, String> emailList = new HashMap<>();
//        emailList.put("Meisam", "Meisam@meicode.org");
//        emailList.put("Brad", "Brad@gmail.com");
//        System.out.println(emailList.get("Meisam"));
//        System.out.println(emailList.size());
//        emailList.remove("Brad");
//        System.out.println(emailList.containsKey("Brad"));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jim", 1001));
        students.add(new Student("Jay", 1002));


        for (Student s: students){
            System.out.println(s.getName() + " " + s.getId() );
        }

    }
}
