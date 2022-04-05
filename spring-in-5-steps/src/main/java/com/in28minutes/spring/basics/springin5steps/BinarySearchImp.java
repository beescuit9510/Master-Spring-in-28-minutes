package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {

    private SortAlgorithm sortAlgorithm;

    @Autowired
    public BinarySearchImp(SortAlgorithm quickSortAlgorithm) {
        this.sortAlgorithm = quickSortAlgorithm;
    }

    public int binarySearch(int[] numbers, int intToFind) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println(sortAlgorithm);

        return 0;
    }

}
