package com.demo.restTemplateDemo.service;

import com.demo.restTemplateDemo.entity.DepartmentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class DepartmentService {

    @Autowired
    private RestTemplate restTemplate;


    public DepartmentInfo getDepartment() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <DepartmentInfo> entity = new HttpEntity <DepartmentInfo>(headers);
        return restTemplate.exchange("http://localhost:8080/student-data", HttpMethod.GET, entity,DepartmentInfo.class).getBody();
    }

    public DepartmentInfo getDepartment(int studentId) {
//        HttpEntity<Student> entity = new HttpEntity<Student>()
        return null;
    }

    public DepartmentInfo saveDepartment(DepartmentInfo student) {
        return null;
    }


    public DepartmentInfo updateDepartment(int departmentId, DepartmentInfo department) {
        return null;
    }

    public String deleteStudent(int studentId) {
        return null;
    }
}
