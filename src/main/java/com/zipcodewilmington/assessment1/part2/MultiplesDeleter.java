package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.part1.BasicArrayUtils;
import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%2 == 0) {
                ints[i] = -1;
            }
        }
        Integer[] result = new Integer[ints.length - ArrayUtils.getNumberOfOccurrences(ints, -1)];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != -1) {
                result[count] = ints[i];
                count ++;
            }
        }

        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%2 == 1) {
                ints[i] = -1;
            }
        }
        Integer[] result = new Integer[ints.length - ArrayUtils.getNumberOfOccurrences(ints, -1)];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != -1) {
                result[count] = ints[i];
                count ++;
            }
        }

        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%3 == 0) {
                ints[i] = -1;
            }
        }
        Integer[] result = new Integer[ints.length - ArrayUtils.getNumberOfOccurrences(ints, -1)];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != -1) {
                result[count] = ints[i];
                count ++;
            }
        }

        return result;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%multiple == 0) {
                ints[i] = -1;
            }
        }
        Integer[] result = new Integer[ints.length - ArrayUtils.getNumberOfOccurrences(ints, -1)];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != -1) {
                result[count] = ints[i];
                count ++;
            }
        }

        return result;
    }
}
