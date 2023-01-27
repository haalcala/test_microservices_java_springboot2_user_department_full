package com.mycompany.department.service.controllers;

import com.mycompany.department.service.entities.Department;
import com.mycompany.department.service.services.DepartmentServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentServices departmentServices;

    @PostMapping("")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("DepartmentController.saveDepartment::");
        return departmentServices.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("DepartmentController.findDepartmentById::");
        return departmentServices.findDepartmentById(departmentId);
    }
}
