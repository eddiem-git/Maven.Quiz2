package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if(value >= 5) {
            return true;
        }else{
            return false;
        }


    }

    public Boolean isLessThan7(Integer value) {
        if(value <= 7) {
            return true;
        }else{
            return false;
        }


    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(valueToEvaluate >= 5 && valueToEvaluate <= 7) {
            return true;
        }else{
            return false;
        }


    }

    public Boolean startsWith(String string, Character character) {
        //character is identical of the first character in string
        //if character is uppercase or lowercase, it should assert (true)as long as the character is identical
        if(string.charAt(0) == character){
            return true;
        }else{
            return false;
        }
    }
}
