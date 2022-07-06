package com.company.ArraysAndStrings;
import java.util.Arrays;
import java.util.Scanner;
public class CheckPermutation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = sc.next();
        System.out.print("Enter Second String: ");
        String str2 = sc.next();
        char []a1 = str1.toCharArray();
        Arrays.sort(a1);
        char []a2 = str2.toCharArray();
        Arrays.sort(a2);
        if(new String(a1).equals(new String(a2))){
            System.out.println(str2 + "  is Permutation of " + str1);
        } else{
            System.out.println(str2 + "  is not a Permutation of " + str1);
        }
    }
}
