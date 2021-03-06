package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    ComponentJdbcConnection jdbcConnection;

    @Autowired
    public ComponentDAO(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public ComponentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}
