package com.test;

import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryGap {

    @Test
    public void test0() {
        int val = -1;
        int val2 =2;
        System.out.println(":" + (val>>>1));
    }

    @Test
    public void test1() {
        BinaryGapUtil util = new BinaryGapUtil();
        assertEquals(0,  util.getBinaryGap(32));
    }

    @Test
    public void test2() {
        BinaryGapUtil util = new BinaryGapUtil();
        assertEquals(5,  util.getBinaryGap(1041));
    }

    private static class BinaryGapUtil {

        public int getBinaryGap(int value) {

            if (value < 0) throw new InvalidParameterException("The value should be positive");

            char[] strNumber = Integer.toBinaryString(value).toCharArray();

            List<Integer> binaryGapLengths = new ArrayList();

            int onesCounter = 0;
            int zeroCounter = 0;
            for (char character: strNumber) {
                if (character == '1') {
                    zeroCounter = addZeroCounter(binaryGapLengths, onesCounter, zeroCounter);
                    onesCounter = verifyIfIsTheFirstOne(onesCounter);
                    continue;
                }
                zeroCounter++;
            }

            return binaryGapLengths.stream().max(Integer::compareTo).orElse(0);
        }

        private int addZeroCounter(List<Integer> binaryGapLengths, int onesCounter, int zeroCounter) {
            if (onesCounter > 0 && zeroCounter > 0) {
                binaryGapLengths.add(zeroCounter);
                zeroCounter = 0;
            }
            return zeroCounter;
        }

        private int verifyIfIsTheFirstOne(int onesCounter) {
            if (onesCounter == 0) {
                onesCounter++;
            }
            return onesCounter;
        }
    }

}
