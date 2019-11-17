package com.examples.examples.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IterationServiceImpl implements IterationsService{

    @Override
    public ArrayList<String> sortedCharArray(String[] array) {
        return null;
    }

    @Override
    public Integer[] sortedNumberArray(Integer[] array) {
        Integer[] sortedArray = array.clone();
        if(array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int tmp = 0;
                    if (sortedArray[i] > sortedArray[j]) {
                        tmp = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = tmp;
                    }
                }
            }
        }
        return sortedArray;
    }
}

