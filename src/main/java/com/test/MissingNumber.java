package com.test;

import java.util.Arrays;
import java.util.TreeSet;

public class MissingNumber {

    public static void main(String args[]) {

        MissingNumber m = new MissingNumber();
        int array[] = new int[]{1,2,4,5};
        System.out.println(m.solution(array));


    }

    public int solution(int[] A) {

        if (A == null || A.length < 1) return 0;


        for (int value =1;  value <= A.length + 1 ; value++)
            if(!containsValue(A, value)) return value;

        System.out.println("" + Arrays.toString(A));

        return 0;
    }


    private boolean containsValue(final int[] array, final int value) {
        for(int i=0; i<array.length; i++)
            if (array[i] == value) return true;

        return false;
    }


}
