package com.klef.jfsd.exam;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);

        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        Course course = (Course) context.getBean("course");
        System.out.println(course);
	}

}
