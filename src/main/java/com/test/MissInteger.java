package com.test;

import java.util.HashMap;
import java.util.Map;

public class MissInteger {

    public int solution(int[] A) {

        Map<Integer, Boolean> map =  new HashMap<>();
        boolean isTherePositive = false;

        for (int i=0; i< A.length; i++) {
            map.putIfAbsent(A[i], true);

            if (A[i] > 0) isTherePositive = true;
        }
         if(!isTherePositive) return 1;

         for(int i=0; i <= map.keySet().size(); i++) {
             int r= i+1;
            if (!map.containsKey(r)) return (r);
         }

         return 1;
    }



    public static void main (String args []){
        MissInteger mn = new MissInteger();
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        System.out.println("" + mn.solution(A));

        int[] B = new int[]{1, 2, 3};
        System.out.println("" + mn.solution(B));

        int[] C = new int[]{-1, -3};
        System.out.println("" + mn.solution(C));



    }


}
