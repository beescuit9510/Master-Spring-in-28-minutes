package com.in28minutes.spring.basics.componentscan.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    JdbcConnection jdbcConnection;

    @Autowired
    public PersonDAO(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}
