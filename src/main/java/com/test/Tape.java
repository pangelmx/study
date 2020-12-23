package com.test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tape {

    public int solution(int[] A) {

        if (A.length < 2) throw new InvalidParameterException("Invalid params");

        int izq = 0;
        int der = sumArray(A);
        int answer = 0;

        for (int i=0; i < A.length -1; i++) {
            izq+= A[i];
            der-= A[i];
            int absSubstraction = Math.abs(izq - der);

            if (i ==0) {
                answer = absSubstraction;
            }
            else
                answer= (absSubstraction < answer) ? absSubstraction: answer;
        }

        return answer;
    }

    private int sumArray(int[] A) {
        int res = 0;
        for (int i=0; i < A.length; i++)
            res+=A[i];

        return res;
    }


    public static void main(String args[]) {

        Tape tape = new Tape();
        int[] A = new int[]{3,1,2,4,3};
        System.out.println("Bye bye: "+ tape.solution(A));

        int[] B = new int[]{-10, -20, -30, -40, 100};
        System.out.println("Bye bye: "+ tape.solution(B));

        int[] C = new int[]{-1000, 1000};
        System.out.println("Bye bye: "+ tape.solution(C));
    }
}
