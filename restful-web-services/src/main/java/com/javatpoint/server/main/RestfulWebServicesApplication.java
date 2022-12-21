package com.javatpoint.server.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.employee.model.Employee;

@SpringBootApplication
public class RestfulWebServicesApplication implements CommandLineRunner{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(RestfulWebServicesApplication.class, args);
    }

    // @Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM employees";
        List<Employee> employees = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Employee.class));
        System.out.println("a"); 
        //customers.forEach(System.out :: println);
    }
}