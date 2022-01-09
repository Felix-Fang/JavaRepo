package org.xfang;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myAge = 30;
        int herAge = 28;
        byte hisAge = 27;
        long viewCount = 2_333_111_000L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        Date now = new Date();
        now.getTime();

        // primitive type is independent
        byte a = 1;
        byte b = a;
        a = 2;

        // reference type is not, only stores the reference address
        Point point1 = new Point(1, 2);
        Point point2 = point1;

        point1.x = 2;

        String message = "Hello Java" + "!";

        System.out.println(viewCount);
        System.out.println(now.getTime());
        System.out.println(now);
        System.out.println(isEligible);
        System.out.println(myAge);
        System.out.println(a);
        System.out.println(b);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(message);
    }
}
