package com.demo.restTemplateDemo.controller;

import com.demo.restTemplateDemo.entity.DepartmentInfo;
import com.demo.restTemplateDemo.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @GetMapping("/departments")
    public DepartmentInfo getDepartment(){
        return departmentService.getDepartment();
    }

    @GetMapping("/departments/{id}")
    public DepartmentInfo getDepartment(@PathVariable("id") int studentId){
        return departmentService.getDepartment(studentId);
    }

    @PostMapping("/departments")
    public DepartmentInfo saveDepartment(@Valid @RequestBody DepartmentInfo department){
        return departmentService.saveDepartment(department);
    }

    @PutMapping("/departments/{id}")
    public DepartmentInfo updateDepartment(@PathVariable("id") int studentId, @RequestBody DepartmentInfo department){
        return departmentService.updateDepartment(studentId, department);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteStudent(@PathVariable("id") int departmentId){
        return departmentService.deleteStudent(departmentId);
    }

}
