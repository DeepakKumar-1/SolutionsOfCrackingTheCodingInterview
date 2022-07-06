package com.company.ArraysAndStrings;

import java.util.Scanner;

public class StringRotation {
    public static boolean isSubString(String s1, String s2){
        return (s2+""+s2).contains(s1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String s1 = sc.next();
        System.out.print("Enter Second String: ");
        String s2 = sc.next();
        System.out.println(isSubString(s1, s2));
    }
}
