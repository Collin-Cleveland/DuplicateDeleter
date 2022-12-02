package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    public Integer NumOfOccurences(T value) {
        int count = 0;

        for (T elem : array) {
            if (elem.equals(value)){count++;}
        }
        return count;
    }
}
