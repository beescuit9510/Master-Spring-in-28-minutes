package com.in28minutes.spring.basics.componentscan.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quickSortAlgorithm")
public class QuickSortAlgorithm implements SortAlgorithm{

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
