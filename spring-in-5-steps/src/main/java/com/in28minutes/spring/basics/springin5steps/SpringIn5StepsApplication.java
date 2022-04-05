package com.in28minutes.spring.basics.componentscan.springin5steps;

import com.in28minutes.spring.basics.componentscan.springin5steps.basic.BinarySearchImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    //To make best use of spring we need to tell 3 things to spring
    //What are the beans? //by adding @Component
    //What are the dependencies of a bean? //by adding @Autowired
    //Where to search for beans? // by adding @ComponentScan or @SpringBootApplication (it automatically scans the package and the sub-packages of the package where this is in)
    // for now => no need (bcz BinarySearchImpl and BubbleSortAlgorithm is in the same package)

    // ApplicationContext where all the beans going to be present and managed
    //Spring creates, injects and manages dependencies, manages the entire lifecycle of all the beans

    //whether using setter or field both are same in the way spring dose the autowiring is the same
    //in the earlier days mandatory dependency should have been autowired using constructor and optional dependency went for setter injection
    // but nowadays there is no big difference between mandatory and optional dependencies
    // ( since Spring dose not log setter and field injection it is recommended to use constructor)


    //Autowiring when there are multiple matching beans more than one
    //@Primary
    //using variable name (when it comes to constructor injection, have to match the constructor parameter names, not the member variable name)
    //@Qualifier (when it comes to constructor, have to annotation annotate it to constructor parameter
    //priority @Qualifier >@Primary > variable name
    //if there is one favorite and most important thing that is favored in all the situations then use @Primary
    // otherwise name or @Qualifier, usi ng name makes it much clearer


    //Bean lifecycle bean Scope
    //bean_scope : singleton / prototype / request / session
    //@Scope("[bean_scope]")
    // instead of hardcoding use enums that spring provides for us such as BeanDefinition or ConfigurableBeanFactory classes


    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

        BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);

        BinarySearchImp binarySearch1 = applicationContext.getBean(BinarySearchImp.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result = binarySearch.binarySearch(new int[]{1, 2, 3, 4}, 1);

        System.out.println(result);
    }

}

