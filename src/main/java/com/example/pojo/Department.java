package com.example.pojo;

/**
 * @author Guohua Zhang
 * @create 2022-02-07 12:50 PM
 */
public class Department {
    int deptId;
    String name;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(int deptId, String name) {
        this.deptId = deptId;
        this.name = name;
    }
}
