package com.programs.test;

public class Test {
    public static void main(String[] args) {
        System.out.println("main");
        Character[] arr = {'c', 'a', 'e', 'g', 'd', 'q'} ;
        //Integer[] arr = {8,4,1,6,9,11,54,33} ;

    //    a, c,d, e,g,q
                Character target = 'z';



        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    Character temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println(immediateCharater(arr, target));


    }

    public static Character immediateCharater(Character[] arr, Character target){
        int index = 0;
        Character result = null;
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                System.out.println("target idex value :"+ i);

                if(i == arr.length-1){
                    result = arr[0];
                }else{
                    result = arr[i+1];
                }

            }

        }

        return result;
    }
}
