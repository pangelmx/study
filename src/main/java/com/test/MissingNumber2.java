package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber2 {

    public static void main(String args[]) {

        MissingNumber2 m = new MissingNumber2();
        int array[] = new int[]{1,2,4,5};
        System.out.println(m.solution(array));


    }

    public int solution(int[] A) {

        if (A == null || A.length < 1) return 1;

        Integer[] array = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Set<Integer> tree = new TreeSet(Arrays.asList(array));
        for (int i=1; i<= A.length + 1; i++)
            if (!tree.contains(i)) return i;

        return 0;
    }



}
