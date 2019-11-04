package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i / 2 == 0 ){
                return false;
            }else if(i % 2 == 0){
            }
        } return true;
    }

    public Integer[] range(Integer start, Integer stop) {
        //make a new array to give a Array of integers from start to stop in an array
        Integer startRange = start;
        ArrayList<Integer> Result = new ArrayList<>();
        for (int i = 0; i < Result.size(); i++) {
            if(startRange <= stop) {
            startRange++;
            Result.add(startRange);
            Result.add(stop);
        }
        }return null;
    }
    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer getFirstElement = array[0];
        Integer getSecondElement = array[1];
        Integer result = getFirstElement + getSecondElement;
        return result;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int number = array.length;
        int result = 1;
        for (int i = 1; i < number; i++)
            result = result * array[i];
        return result;
    }
}
