package com.tofunmi;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(3,60);

        /*numbers.remove(3);
        //numbers.clear();

        numbers.add(35);

        numbers.contains(35);
        numbers.set(0,1); //to replace a number

        Boolean container = numbers.contains(35);
        //numbers.isEmpty();
        Boolean empty = numbers.isEmpty();

        if (container==true){
            System.out.println("Number Present");
        }

        //System.out.println(empty);
        //System.out.println(container);


        for (int i=0; i < numbers.size() ; i++){
            System.out.println(numbers.get(i));
        }
        
         */
        System.out.println(numbers);
    }
}