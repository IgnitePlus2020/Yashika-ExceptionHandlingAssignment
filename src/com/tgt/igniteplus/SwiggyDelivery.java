package com.tgt.igniteplus;

import java.util.ArrayList;
import java.util.Scanner;

public class SwiggyDelivery{
    static ArrayList<Integer> code = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the zipcode");
        int zipcode = in.nextInt();
        code.add(123);
        code.add(456);
        code.add(789);
        try {
            checkcode(zipcode);
        } catch (Exception e) {
            System.out.println("Delivery unavailable at this location");
        }
    }

    public static void checkcode(int zipcode) throws InvalidzipcodeException {
        int flag = 0;
        for (int i = 0; i < code.size(); i++) {
            if (zipcode != code.get(i))
                flag = 1;
            else
                throw new InvalidzipcodeException("Invalid");
        }
        System.out.println("Delivery available at this location");
    }
}

class InvalidzipcodeException extends Exception {
    InvalidzipcodeException(String s) {
        super(s);
    }
}
