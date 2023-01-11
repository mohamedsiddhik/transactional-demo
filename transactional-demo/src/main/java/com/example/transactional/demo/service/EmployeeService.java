package com.example.transactional.demo.service;

import com.example.transactional.demo.entity.Department;
import com.example.transactional.demo.entity.Employee;
import com.example.transactional.demo.repository.DepartmentRepository;
import com.example.transactional.demo.repository.EmployeeRepository;
import com.example.transactional.demo.vo.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;
    public String saveEmployee(EmployeeRequestVO employeeRequestVO) {
        Department department =new Department();
        department.setDepartmentName(employeeRequestVO.getDepartmentName());
        department.setDepartmentCode(employeeRequestVO.getDepartmentName());
        Long departmentId = departmentRepository.save(department)
                .getDepartmentId();

        Employee employee = new Employee();
        employee.setEmpName(employeeRequestVO.getEmpName());
        employee.setEmail(employeeRequestVO.getEmail());

        employeeRepository.save(employee);
        return "Employee is saved with Employee Id : " + employee.getEmployeeId();
    }
}
