package com.company.ArraysAndStrings;

import java.util.HashSet;
import java.util.Scanner;

public class IsUnique {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any String: ");
        String str = sc.next();
        HashSet<Character> set = new HashSet<>();
        StringBuilder str2 = new StringBuilder();
        for(char ch : str.toCharArray()){
           if(!set.contains(ch)){
               str2.append(ch);
               set.add(ch);
           }
        }
        System.out.println(set);
        System.out.println(str  + " " + str2);
        if(str.equals(new String(str2))){
            System.out.println(str + " is Unique");
        } else{
            System.out.println(str + " is not Unique");
        }
    }
}
