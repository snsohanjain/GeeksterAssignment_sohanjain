package com.codewithsohan;

public class Typecasting {
    public static void main(String[]args){
        short oldAge =20;
        int newAge = oldAge;

        System.out.println(oldAge);
        System.out.println(newAge);

        int salary = 10000;
        double new_salary = salary;
        System.out.println(salary);
        System.out.println(new_salary);

        // narrow // explicit

        int cash = 20000;
        short new_cash = (short) cash;
        System.out.println(cash);
        System.out.println(new_cash);


        // explicit type casting

        int money = 500000000;
        short new_money = (short) money;
        System.out.println(money);
        System.out.println(new_money);

        float numb = 21.446324f;
        int my_numb = (int) numb;
        System.out.println(numb);
        System.out.println(my_numb);







    }
}
