package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
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
