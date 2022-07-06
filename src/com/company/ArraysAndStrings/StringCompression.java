package com.company.ArraysAndStrings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Compressed String: ");
        String str = sc.next();
        char []s = str.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length; i++){
            char ch = str.charAt(i);
            if('a'<=ch && ch >= 'z' || 'A' <= ch && ch >='Z'){
                ans.append(ch);
            } else{
                for(int k=1; k<ch-'0'; k++){
                    ans.append(str.charAt(i-1));
                }
            }
        }
        System.out.println(new String(ans));
    }
}
