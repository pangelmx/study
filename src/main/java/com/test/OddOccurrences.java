package com.test;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddOccurrences {

    private static final int SIZE_MAX_LIMIT = 1000000;
    private static final int SIZE_MIN_LIMIT = 1;


    public int solution(int[] A) {

        if (null == A || A.length < SIZE_MIN_LIMIT || A.length > SIZE_MAX_LIMIT) throw new InvalidParameterException("Invalid parameters");

        Integer[] array = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Map<Integer, List<Integer>> map = Arrays.stream(array).collect(Collectors.groupingBy(val -> val));
        return map.values().stream().filter(x-> (x.size() % 2)!= 0).mapToInt(ss -> ss.get(0)).min().getAsInt();

    }




    public static void main(String args[]) {

        int[] A = new int[]{9,3,9,3,9,7,9};

        OddOccurrences oddOccurrences = new OddOccurrences();
        System.out.println(oddOccurrences.solution(A));
    }

}
