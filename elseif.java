package com.codewithsohan;

public class elseif {
    public static void main(String[] args) {
        int num = 0;
        if (num > 0){
            System.out.println("POSITIVE");
        }else if (num < 0){
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }

        int new_num = 500;
        if (new_num > 400){
            System.out.println("Greater then 400");
        } else if ( new_num > 100){
            System.out.println("Greater then 100");
        }else {
            System.out.println("Greater then 0");
        }

        int MY_CREDIT_SCORER  = 760;
        if ( MY_CREDIT_SCORER >= 750){
            System.out.println("Eligible for loan");
        }else if (MY_CREDIT_SCORER >= 600){
            System.out.println("Contact Bank Manager");
        }else  {
            System.out.println("Not Eligible");
        }
    }
}
