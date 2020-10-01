package com.company;

public class Employees {

    private String empName;
    private String empID;

    public Employees(String empID, String empName){
        this.empID = empID;
        this.empName = empName;

    }

    public String getEmpName(){
        return this.empName;
    }
}
