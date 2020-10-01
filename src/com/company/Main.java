package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("First branch");
        System.out.println("second branch");
        System.out.println("another change on second branch");

        Employees emp1 = new Employees("1234", "Kevin");
        System.out.println(emp1.getEmpName());

    }
}
