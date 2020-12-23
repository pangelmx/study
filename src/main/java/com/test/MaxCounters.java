package com.test;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A) {

        int MAX_COUNTER = N +1;
        int[] counterArray = new int[N];
        int lastUpdate = 0;
        int maxValueInRow = 0;

        for (int i=0; i < A.length; i++) {

            if (A[i] == MAX_COUNTER) {
                lastUpdate = maxValueInRow;
                continue;
            } else {
                int position = A[i] -1;
                if (counterArray[position] < lastUpdate )
                    counterArray[position] = lastUpdate +1;
                else
                    counterArray[position]++;

                if  (counterArray[position] > maxValueInRow)
                    maxValueInRow = counterArray[position];

            }

        }

        for (int i=0 ; i < N; i++)
            if (counterArray[i] < lastUpdate) counterArray[i] = lastUpdate;


        return counterArray;
    }

    public static void main(String args []) {
        MaxCounters mc = new MaxCounters();
        int[] A =  new int[]{3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(mc.solution(5, A)));

    }


}
