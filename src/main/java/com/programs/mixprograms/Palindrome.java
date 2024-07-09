package com.programs.mixprograms;

public class Palindrome {
    public static void main(String[] args) {

        String palindrom = "madam";
        System.out.println(checkPalindrome(palindrom));

    }

    public static boolean checkPalindrome(String str){
        int sp =0;
        int ep =str.length()-1;
        boolean result= false;
       while (sp <ep){
           if(str.charAt(sp) == str.charAt(ep)){
               sp++;
               ep--;
               result = true;
           }else{
               result = false;
               break;
           }
       }
        return result;
    }
}
