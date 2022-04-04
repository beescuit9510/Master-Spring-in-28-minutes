package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    //To make best use of spring we need to tell 3 things to spring
    //What are the beans? //by adding @Component
    //What are the dependencies of a bean? //by adding @Autowired
    //Where to search for beans?
    // (by adding @ComponentScan or @SpringBootApplication)
    // (it automatically scans the package and the sub-packages of the package where this is in)
    // => no need (bcz BinarySearchImpl and BubbleSortAlgorithm is in the same package)

    // ApplicationContext where all the beans going to be present and managed

    //Spring creates , injects and manages dependencies, manages the entire lifecycle of all the beans

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

        BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);

        int result = binarySearch.binarySearch(new int[]{1,2,3,4},1);

        System.out.println(result);
    }

}

