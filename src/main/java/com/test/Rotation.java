package com.test;


import java.util.Arrays;

public class Rotation {

    public static final int ONE_POSITION = 1;

    public static void main(String args[]) {
        Rotation rotation = new Rotation();
        int A[] = new int[]{3,8,9,7,6};
        int[] result = rotation.solution(A, 3);
        System.out.println("Complete" + Arrays.toString(result));

        int B[] = new int[]{0,0,0};
        result = rotation.solution(B, 1);
        System.out.println("Complete" + Arrays.toString(result));

        int C[] = new int[]{1,2,3,4};
        result = rotation.solution(C, 4);
        System.out.println("Complete" + Arrays.toString(result));

        int D[] = new int[]{};
        result = rotation.solution(D, 1);
        System.out.println("Complete" + Arrays.toString(result));

    }

    public int[] solution(int[] A, int K) {

        if (null == A || A.length < 1) return A;

        int [] rotated = new int[A.length];
        System.arraycopy(A, 0, rotated, 0, A.length);

        for (int i=0; i<K; i++)
            rotated = rotate1PositionToRight(rotated);

        return rotated;
    }

    private int[] rotate1PositionToRight(int[] A) {
        int lastValue = A[A.length-1];
        int[] result = shiftArrayToTheRight(A, ONE_POSITION);
        result[0] = lastValue;
        return result;
    }

    private int[] shiftArrayToTheRight(int[] array, int index) {

        int[] result = new int[array.length];
        if (array.length - index >= 0)
            System.arraycopy(array, 0, result, 0 + index, array.length - index);

        return result;
    }
}
