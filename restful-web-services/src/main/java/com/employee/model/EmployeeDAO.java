package com.employee.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.sym.Name;

// public interface EmployeeDAO {

//     //void addStudent(String name, String surname);

//     //ArrayList<Employee> ;
// }


public class EmployeeDAO {
    public EmployeeDAO() {
        super();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object a =  ctx.getBean("dataSource");
        
        jdbcTemplate = new JdbcTemplate((DataSource) a);
    }


    //private Datasource datasource;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //getEmployeeList get database from table
    public ArrayList<Employee> getEmployeeList() {
        
        String sql = "SELECT * FROM employees";
        ArrayList<Employee> employees = (ArrayList<Employee>) jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));
        //System.out.println("a"); 
        return employees;
    }
    //addEmployeeList get database from table
    public void addEmployee(Employee employee) {
        
        String sql = String.format("INSERT INTO employees (employID, name, birthdate, role, sex, password) VALUES (\'%s\', \'%s\', \'%s\', \'%s\', \'%s\', \'%s\')", employee.employID, employee.name, employee.birthdate, employee.role, employee.sex, employee.password);

        jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));
        System.out.println("a"); 

    }

    //public int


}
