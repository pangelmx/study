package com.test;

import java.util.*;

public class FrogCross {

    public int solution(int X, int[] A) {
        Map<Integer, Boolean> path = new HashMap();
        int second = -1;

        for (int i=0; i < A.length; i++) {

            if (A[i] > X) continue;

            path.putIfAbsent(A[i], true);

            if (isPathComplete(path, X)) return i;

        }
        return second;
    }

    private boolean isPathComplete(Map<Integer, Boolean> path, int X) {
        if (path.size() == X) return true;
        return false;
    }

    public static void main(String args[]) {

        FrogCross frogCross = new FrogCross();


        //int[] C = new int[]{1,3,1,4,2,3,5,4};
        //System.out.println("Bye bye: "+ frogCross.solution(5, C));

        int[] C = new int[]{1, 3, 1, 3, 2, 1, 3};
        System.out.println("Bye bye: "+ frogCross.solution(3, C));
    }

}
