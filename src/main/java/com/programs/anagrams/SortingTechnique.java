package com.programs.anagrams;

public class SortingTechnique {

    public static void main(String[] args) {
        System.out.println(checkAnagram("earth","heart"));

    }

    public static boolean checkAnagram(String str, String str2){
        boolean result = false;
        if(str.length() != str2.length()){
            return false;
        }
        char[] arr1 = str.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        sortArray(arr1);
        sortArray(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i]){
                result = true;
            }else{
                result = false;
                break;
            }
        }
        return result;
        //return Arrays.equals(arr1,arr2);

    }
    public static char[] sortArray(char[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if(arr1[i] > arr1[j]){
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] =temp;
                }
            }

        }
        return arr1;
    }
}
