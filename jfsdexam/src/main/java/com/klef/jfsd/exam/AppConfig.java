package com.klef.jfsd.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee("John Doe", 75000.0, "Engineering", List.of("Java", "Spring", "Hibernate"));
    }

    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(101);
        instructor.setInstructorName("Dr. Smith");
        return instructor;
    }

    @Bean
    public Course course(Instructor instructor) {
        Course course = new Course();
        course.setCourseId(501);
        course.setCourseName("Spring Framework");
        course.setCredits(4);
        course.setInstructor(instructor);
        return course;
    }
}
