package com.company;

public class Main {

    public static void main(String[] args) {
        //find all elements which sum of 3 numbers give a value 0
        int [] array = {-2, 1, 3, -1, 5, -3, 7, -6};
        for (int i = 0; i < array.length;) {
            for (int j = i++; j < array.length;) {
                for (int k = j++; k < array.length;) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("The three elements whose sum is equal to zero");
                        System.out.println("The elements are: " + array[i] + " " + array[j] + " "+ array[k]);
                        return;
                    }
                }
            }
        }
    }
}



/*
Cracking the Coding Interview: Being able to explain key concepts of algorithms
O(n3)
Find whether array has duplicates
Palindrome Permutation
Google Academy
Brute Force Algorithm
The flow and entire process of sending and receiving a bunch of methods
Priority que
Quick sort
Trees

 */
