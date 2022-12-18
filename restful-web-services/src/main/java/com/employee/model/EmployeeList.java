package com.employee.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class EmployeeList extends ArrayList<Employee> {
    //ArrayList<Employee> list;
    Employee cd;
    int index;

    // public EmployeeList() {
    //     this.list = new ArrayList<Employee>();
    //     this.cd = null;
    //     this.index = 0;
    // }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String encode(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException exception) {
            throw new RuntimeException(exception);
        }

    }

    public void addInforToFile() {
        String pw1 = encode("111111");
    }

}
