package com.employee.model;

import java.io.Serializable;

public class Employee implements Serializable {

    protected String employID, name, birthdate, role, sex, password;

    public Employee() {
    }

    public Employee(String employID, String name, String birthdate,String role,String sex,String password) {
        this.employID= employID;
        this.name = name;
        this.birthdate = birthdate;
        this.role = role;
        this.sex = sex;
        this.password = password;
    
    }

    public String getEmployID() {
        return employID;
    }
    public void setEmployID(String employID) {
        this.employID = employID;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee ID = " + this.employID + "Name = " + name + "Birthdate = " + birthdate + "Role = " + role + "Sex = " + sex + "Password = " + password;
    }

}
