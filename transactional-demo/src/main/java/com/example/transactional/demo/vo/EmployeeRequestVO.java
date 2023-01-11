package com.example.transactional.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestVO {
    private String empName;
    private String email;
    private String departmentName;
}
