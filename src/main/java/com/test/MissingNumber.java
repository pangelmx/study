package com.test;

import java.util.Arrays;
import java.util.TreeSet;

public class MissingNumber {

    public static void main(String args[]) {

        MissingNumber m = new MissingNumber();
        int array[] = new int[]{1,2,4,5};
        System.out.println(m.solution(array));


    }

//    public int solution(int[] A) {
//        long length = A.length + 1;
//        long nPlusOneSum = (length +1) * (length) / 2;
//        long arraySum = 0;
//        for (int element : A)
//            arraySum += element;
//        return (int)(nPlusOneSum - arraySum);
//    }

    public int solution(int A[]) {
        int length = A.length;
        int xor_sum = 0;
        for (int i=0; i < length; i++) {
            xor_sum = xor_sum ^ A[i] ^ (i+1);
        }
        return xor_sum^(length+1);
    }

}
