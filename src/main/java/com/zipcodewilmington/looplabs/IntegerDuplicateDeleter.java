package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        int index = 0;

        for (Integer elem : array){
            if (NumOfOccurences(elem) < maxNumberOfDuplications){
                newArr[index] = elem;
                index++;
            }
        }
        return Arrays.copyOf(newArr, index);

        //return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        int index = 0;

        for (Integer elem : array){
            if (NumOfOccurences(elem) != exactNumberOfDuplications){
                newArr[index] = elem;
                index++;
            }
        }
        return Arrays.copyOf(newArr, index);
//        int newArrLen = 0;
//
//        for (int i = 0; i < array.length; i++){ //determine size of newArr
//            int count = 0;
//            for(int j = 0; j < array.length; j++){
//                if (array[i].equals(array[j])){
//                    count++; //number of duplicates of that element
//                }
//            }
//            if (count != exactNumberOfDuplications){ //only add elements that != param
//                newArrLen++;
//            }
//        }
//
//        Integer[] newArr = new Integer[newArrLen];
//        int index = 0;
//
//        for (int i = 0; i < array.length; i++){
//                if (array[i].equals(array[i + exactNumberOfDuplications - 1])) {
//                    if (i + exactNumberOfDuplications >= array.length) {
//                        break;
//                    }
//                    else { i += exactNumberOfDuplications;}
//                } else {
//                    newArr[index] = array[i];
//                    index++;
//                }
//        }
//        return newArr;
        //return new Integer[0];
    }
}
