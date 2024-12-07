package com.klef.jfsd.exam;

import java.util.List;

public class Employee {

	 private String name;
	    private Double salary;
	    private String department;
	    private List<String> skills;

	    public Employee(String name, Double salary, String department, List<String> skills) {
	        this.name = name;
	        this.salary = salary;
	        this.department = department;
	        this.skills = skills;
	    }

	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + ", skills=" + skills + "]";
	    }
}
