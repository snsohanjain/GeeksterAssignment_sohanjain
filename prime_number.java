package com.codewithsohan;

public class prime_number {

    public static void main(String [] args){




    int numb = 13;

    int count_of_factors = 0;

    for (int i= 1; i <= numb;  i++){
        if (numb % i == 0){
            count_of_factors = count_of_factors + 1;

        }


    }
        System.out.println(count_of_factors);
    if (count_of_factors == 2) {
        System.out.println("PRIME");
    }
       else {
            System.out.println("NOT PRIME");
        }


    }

}
