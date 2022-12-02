package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] newArr = new String[array.length];
        int index = 0;

        for (String elem : array){
            if (NumOfOccurences(elem) < maxNumberOfDuplications){
                newArr[index] = elem;
                index++;
            }
        }
        return Arrays.copyOf(newArr, index);

        //return new String[0];
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] newArr = new String[array.length];
        int index = 0;

        for (String elem : array){
            if (NumOfOccurences(elem) != exactNumberOfDuplications){
                newArr[index] = elem;
                index++;
            }
        }
        return Arrays.copyOf(newArr, index);

        //return new String[0];
    }
}
