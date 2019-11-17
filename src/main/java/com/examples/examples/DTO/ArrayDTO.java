package com.examples.examples.DTO;

import java.util.Arrays;

public class ArrayDTO {

    private String[] charArray;
    private Integer[] intArray;
    private String [] multiArray;

    public ArrayDTO() {
    }

    public String[] getCharArray() {
        return charArray;
    }

    public void setCharArray(String[] charArray) {
        this.charArray = charArray;
    }

    public Integer[] getIntArray() {
        return intArray;
    }

    public void setIntArray(Integer[] intArray) {
        this.intArray = intArray;
    }

    public String[] getMultiArray() {
        return multiArray;
    }

    public void setMultiArray(String[] multiArray) {
        this.multiArray = multiArray;
    }

    @Override
    public String toString() {
        return "ArrayDTO{" +
                "\n charArray=" + Arrays.toString(charArray) +
                "\n intArray=" + Arrays.toString(intArray) +
                "\n multiArray=" + Arrays.toString(multiArray) +
                '}';
    }


}
