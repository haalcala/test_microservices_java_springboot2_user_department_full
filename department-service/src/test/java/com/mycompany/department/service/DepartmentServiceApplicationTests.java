package com.mycompany.department.service;

import com.mycompany.department.service.entities.Department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DepartmentServiceApplicationTests {

	private Department department;
	@BeforeEach
	void setup() {
		System.out.println("--------------------------");
		department = new Department();

		department.setDepartmentId(1L);
		department.setDepartmentAddress("1111address");
		department.setDepartmentCode("1111code");
		department.setDepartmentName("1111name");
	}

	@Test
	void getDepartmentId() {
		assertNotNull(department);
		assertEquals(department.getDepartmentId(), 1L);
	}

	@Test
	void getDepartmentName() {
		assertNotNull(department);
		assertEquals(department.getDepartmentName(), "1111name");
	}

	@Test
	void getDepartmentAddress() {
		assertNotNull(department);
		assertEquals(department.getDepartmentAddress(), "1111address");
	}

	@Test
	void getDepartmentCode() {
		assertNotNull(department);
		assertEquals(department.getDepartmentCode(), "1111code");
	}

}
