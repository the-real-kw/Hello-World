package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("First branch");
        System.out.println("second branch");

        System.out.println("dec 21 - this should be added then reverted in another branch");

        System.out.println("another change on second branch");
        System.out.println("making changes to third branch");
        System.out.println("This is a fifth branch");
        System.out.println("testing out a new branch");

        System.out.println("going to revert this later - Dec 21");

        Employees emp1 = new Employees("1234", "Kevin");
        System.out.println(emp1.getEmpName());
        System.out.println("another change");



    }
}
