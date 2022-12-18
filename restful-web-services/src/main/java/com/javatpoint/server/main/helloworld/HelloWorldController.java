package com.javatpoint.server.main.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Asset;
import com.employee.model.Employee;
import com.employee.model.DAO.LoginDAO;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;



@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "X-Get-Header")


@Configuration
@RestController
public class HelloWorldController {
    public ArrayList<Employee> employeeList;
    public ArrayList<Asset> assetList;

    public HelloWorldController() {

        
        employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("E160001", "Nguyen Hong Hiep", "12/06/2000", "EM", "male","e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E160240", "Tran Dinh Khanh", "15/07/2002", "EM", "male","e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E140449", "Le Buu Nhan", "10/07/2002", "EM", "male", "e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E160798", "Truong Le Minh", "03/12/2002", "EM", "male","e10adc3949ba59abbe56e057f20f883e"));
        employeeList.add(new Employee("E160052", "Hoa Doan", "05/06/1990", "MA", "male", "e10adc3949ba59abbe56e057f20f883e"));

        assetList = new ArrayList<Asset>();
        assetList.add(new Asset("A001", "Samsung Projector", "White", 500, 10, 3.2));
        assetList.add(new Asset("A002", "Macbook pro 2016", "Sliver", 1000, 5, 2.2));
    }

    

    // using get method and hello-world URI
    @GetMapping(path = "/employees")
    public ArrayList<Employee> helloWorld() {
        return employeeList;
    }
    @GetMapping(path = "/asset")
    public ArrayList<Asset> helloworld() {
        return assetList;
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

    @PostMapping(path = "/login")
    public ArrayList<Employee> Login(@RequestBody LoginDAO loginDAO) {
        System.out.println(loginDAO.employeeID + " & " + loginDAO.password);
        return employeeList;
    }
}
