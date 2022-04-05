package com.in28minutes.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImp {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @PostConstruct
    private void postConstruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("preDestroy");
    }

}
