package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        System.out.println(arrayContainsDuplicates());
    }
    public static boolean arrayContainsDuplicates(){
        Integer[] nums = {7,2,3,4,3};
        Set uniqueList = new HashSet();
        for (int num:nums
             ) {
            if (uniqueList.contains(num)) return true;
            uniqueList.add(num);
        }
        return false;
    }
}