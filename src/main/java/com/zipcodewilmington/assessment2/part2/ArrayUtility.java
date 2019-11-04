package com.zipcodewilmington.assessment2.part2;


import java.util.ArrayList;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> list = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < array1.length; currentIndex++) {
            Integer currentElement = array1[currentIndex];
            list.add(currentElement);
        }
        for (int currentIndex = 0; currentIndex < array2.length; currentIndex++) {
            Integer currentElement = array2[currentIndex];
            list.add(currentElement);
        }
        return list.toArray(new Integer[list.size()]);
    }//(Integer[])list.toArray(new Integer[list.size]);

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        //count how many times a number appears in both arrays
        //create a loop that goes through both arrays
        Integer count = 0;
        for (int i = 0; i < array1.length; i++) {
            if(valueToEvaluate == array1[i]) {
            count++;
            }
            }
        for (int j = 0; j < array2.length; j++) {
            if(valueToEvaluate == array2[j]){
                count++;
            }

        }

        return count;
    }

    public Integer mostCommon(Integer[] array) {
        //given
        Integer mostCommonElement = null;
        Integer mostAmountOfOccurrences = 0;
        //when
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            Integer currentElement = array[currentIndex];
            int numberOfOccurrences = getNumberOfOccurrences(array, currentElement);
            if(numberOfOccurrences > mostAmountOfOccurrences) {
                mostAmountOfOccurrences = numberOfOccurrences;
                mostCommonElement = currentElement;
            }
        }//then
        return mostCommonElement;
    }
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for (int currentIndex = 0; currentIndex <= objectArray.length - 1; currentIndex++) {
            if (objectArray[currentIndex].equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
    }
}
