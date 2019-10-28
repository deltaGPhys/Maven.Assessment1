package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;
        for (int i = 0; i <= n; i++) {
             sum += i;

        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer pro = 1;
        for (int i = 1; i <= n; i++) {
            pro *= i;
        }
        return pro;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String number = val.toString();
        String reversed = BasicStringUtils.reverse(number);
        val = Integer.parseInt(reversed);
        return val;
    }
}
