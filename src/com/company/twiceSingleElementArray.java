package com.company;

public class twiceSingleElementArray {
    public static void main(String[] args) {
        int [] array = {2, 3, 65, 98 ,21 , 21 ,98, 2, 3 };
     

        for (int i = 0; i <array.length; i++ ){
            int count = 0;
            for (int k = 0; k <array.length; k++){
                if (array[i] == array[k]){
                count++;
                }
                
            }
            // System.out.println(count);
            if (count == 1){
                System.out.println(array[i]);
            }
        }
    }
}
