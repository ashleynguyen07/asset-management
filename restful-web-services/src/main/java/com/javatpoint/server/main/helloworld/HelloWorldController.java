package com.javatpoint.server.main.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;


@Configuration
@RestController
public class HelloWorldController {
    public ArrayList<Employee> employeeList;
    public HelloWorldController() {
        employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("E160001", "Nguyen Hong Hiep", "12/06/2000", "EM", "male", "e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E160240", "Tran Dinh Khanh", "15/07/2002", "EM", "male", "e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E140449", "Le Buu Nhan", "10/07/2002", "EM", "male", "e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E160798", "Truong Le Minh", "03/12/2002", "EM", "male", "e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E160052", "Hoa Doan", "05/06/1990", "MA", "male", "e10adc3949ba59abbe56e057f20f883e"));
    } 

    @CrossOrigin(origins = "*", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")


    // using get method and hello-world URI
    @GetMapping(path = "/employees")
    public ArrayList<Employee> helloWorld() {
        return employeeList;
    }

    @GetMapping(path = "/hello-world-bean")
    // method- which returns "Hello World"
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");// constructor of HelloWorldBean
    }

    // passing a path variable
    // hello-world/path-variable/javatpoint
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name)); // %s replace the name
    }
}
