package com.javatpoint.server.main.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

@Configuration
// Controller
@RestController
public class HelloWorldController {
    public ArrayList<Employee> employeeList;
    public HelloWorldController() {
        employeeList = new ArrayList<Employee>();
        //employeeList.add(new Employee());
        employeeList.add(new Employee("B001", "Tra My", "07/07/2001", "EM", null, null));
        employeeList.add(new Employee("B002", "Nam", "07/07/2001", "EM", null, null));
    } 
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
