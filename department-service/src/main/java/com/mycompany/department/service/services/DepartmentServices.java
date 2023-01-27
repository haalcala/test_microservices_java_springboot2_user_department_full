package com.mycompany.department.service.services;

import com.mycompany.department.service.entities.Department;
import com.mycompany.department.service.repositories.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServices {
    @Autowired
    public DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("DepartmentServices.saveDepartment::");

        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("DepartmentServices.findDepartmentById::");

        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}
