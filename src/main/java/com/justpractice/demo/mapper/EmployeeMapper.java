package com.justpractice.demo.mapper;

import com.justpractice.demo.dto.EmployeeDto;
import com.justpractice.demo.entity.Employee;

public class EmployeeMapper {

    //In future, just use MapStruct or ModelMapper

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );

    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }


}
