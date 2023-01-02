package com.maveric.employee.service;

import com.maveric.employee.dto.EmployeeDto;
import com.maveric.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    EmployeeDto getEmployeeDetails(String id);

    EmployeeDto createEmployee(Employee employee);

    EmployeeDto updateEmployeeDetails(Employee employee,String id);

   String deleteEmployee(String id);
}
