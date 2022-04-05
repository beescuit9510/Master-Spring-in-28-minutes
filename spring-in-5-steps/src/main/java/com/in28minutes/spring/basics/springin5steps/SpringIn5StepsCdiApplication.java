package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan.springin5steps.cdi")
public class SpringIn5StepsCdiApplication {

    //create as less number of objects as possible
    // singleton - one instance per Spring context (application context)
    // prototype - new bean whenever requested
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);

        SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{} dao-{}",business, business.getSomeCdiDao());

    }

}

