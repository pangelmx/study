package com.test;

public class FrogJump {


    public int solution(int X, int Y, int D) {
        int target = Y-X;
        return  (target / D) + ((target % D) ==0 ? 0 : 1);
    }


    public static void main(String args[]) {
        FrogJump jump = new FrogJump();

        System.out.println("Result: " + jump.solution(10, 85, 30));

    }

}
