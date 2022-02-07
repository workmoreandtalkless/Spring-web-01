package com.example.pojo;

/**
 * @author Guohua Zhang
 * @create 2022-02-07 12:49 PM
 */
public class Employee {
    int empId;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
