package com.demo.restTemplateDemo.entity;

import lombok.*;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;


@Getter
@Setter
public class DepartmentInfo {

    private int DepartmentId;
    private String departmentName;
    private String DepartmentManager;
    private String DepartmentCode;
    private int DepartmentCount;

}
