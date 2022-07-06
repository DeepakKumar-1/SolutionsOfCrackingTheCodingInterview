package com.company.ArraysAndStrings;
import java.util.HashMap;
import java.util.Scanner;
public class PalindromePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine().replaceAll("\\s", "");
        // When Length of the String is Even
        if(str.length()%2 == 0){
            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch : str.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                } else{
                    map.put(ch, 1);
                }
            }
            // Now check that Every Character must Have a Even Occurrence
            boolean flag = true;
            for(char key : map.keySet()){
                if(map.get(key) % 2 != 0){
                    System.out.println(str + " is not a Palindrome Permutation");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(str + " is Palindrome Permutation ");
            }
        }
        // When Length of the String is Odd
        else{
            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch : str.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                } else{
                    map.put(ch, 1);
                }
            }
            // Now Check for Every entry in HashMap there must have only one character with odd Occurrence
            int count = 0;
            for(char key : map.keySet()){
                if(map.get(key) % 2 != 0){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(str + " is Palindrome Permutation");
            } else{
                System.out.println(str + " is Not Palindrome Permutation");
            }
        }
    }
}
