package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectToCount.equals(objectArray[i])) {
                count ++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] resultArray = new Object[objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove)];
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectToRemove.equals(objectArray[i])) {
                resultArray[count] = objectArray[i];
                count++;
            }
        }
        Integer[] integerArray = Arrays.copyOf(resultArray, resultArray.length, Integer[].class);
        return integerArray;
//        ArrayList<Object> resultArray = new ArrayList<>();
//
//        resultArray.remove(objectToRemove);
//        return resultArray.toArray(new Object[resultArray.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int max = 0;
        int occ = 0;
        Object result = null;
        for (int i = 0; i < objectArray.length; i++) {
            occ = getNumberOfOccurrences(objectArray, objectArray[i]);
           if (occ > max) {
               max = occ;
               result = objectArray[i];
           }
        }
        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer max = Integer.MAX_VALUE;
        int occ = 0;
        Object result = null;
        for (int i = 0; i < objectArray.length; i++) {
            occ = getNumberOfOccurrences(objectArray, objectArray[i]);
            if (occ < max) {
                max = occ;
                result = objectArray[i];
            }
        }
        return result;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static <T> Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] resultArray = new Object[objectArray.length + objectArrayToAdd.length];
        for (int i = 0; i < objectArray.length; i++) {
            resultArray[i] = objectArray[i];
        }
        for (int i = objectArray.length; i < objectArrayToAdd.length + objectArray.length; i++) {
            resultArray[i] = objectArrayToAdd[i-objectArray.length];
        }
        Integer[] integerArray = Arrays.copyOf(resultArray, resultArray.length, Integer[].class);
        return integerArray;
//        ArrayList<T> result = new ArrayList<T>(objectArray.length + objectArrayToAdd.length);
//        for (int i = 0; i < objectArray.length; i++) {
//            result.add(objectArray[i]);
//        }
//        for (int i = 0; i < objectArrayToAdd.length; i++) {
//            result.add(objectArrayToAdd[i]);
//        }
//        Object[] array = result.toArray(new Object[objectArray.length + objectArrayToAdd.length]);
//        return array;

    }
}
