package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;



// /Courses
//course:id,name,author
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course>retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","in28Minutes"),
                new Course(2,"Learn DevOps","in28Minutes"),
                new Course(3,"Learn Azure","in28Minutes"),
                new Course(4,"GCP","in28Minutes")
        );
    }

}
