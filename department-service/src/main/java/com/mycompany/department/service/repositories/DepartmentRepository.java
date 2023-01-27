package com.mycompany.department.service.repositories;

import com.mycompany.department.service.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findDepartmentByDepartmentId(Long departmentId);
}
