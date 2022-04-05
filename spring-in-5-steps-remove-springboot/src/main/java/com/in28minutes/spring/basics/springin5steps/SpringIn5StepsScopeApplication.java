package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

    //create as less number of objects as possible
    // singleton - one instance per Spring context (application context)
    // prototype - new bean whenever requested
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}",personDao);
        LOGGER.info("{}",personDao.getJdbcConnection());
        LOGGER.info("{}",personDao.getJdbcConnection());

        LOGGER.info("{}",personDao2);
        LOGGER.info("{}",personDao2.getJdbcConnection());

    }

}

