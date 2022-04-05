package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication // initialize the Application Context
@Configuration //define an application configuration by adding the annotation @Configuration
@ComponentScan
public class SpringIn5StepsRemoveSpringBootApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsRemoveSpringBootApplication.class);

        BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);

        BinarySearchImp binarySearch1 = applicationContext.getBean(BinarySearchImp.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result = binarySearch.binarySearch(new int[]{1, 2, 3, 4}, 1);

        System.out.println(result);

        applicationContext.close();
    }

}

