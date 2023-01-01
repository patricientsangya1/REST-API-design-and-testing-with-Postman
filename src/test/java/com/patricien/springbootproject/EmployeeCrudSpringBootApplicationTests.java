package com.patricien.springbootproject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.patricien.springbootproject.model.Employee;
import com.patricien.springbootproject.repository.EmployeeRepository;

@SpringBootTest
class EmployeeCrud22385SpringBootApplicationTests {
	
	@Autowired
	EmployeeRepository empRepo;

	@Test
	public void testCreate() {
		
		Employee emp = new Employee();
		emp.setId(14L);
		emp.setFirstName("Patipi");
		emp.setLastName("Tsa");
		emp.setEmail("pa@tgmail.com");
		empRepo.save(emp);
		assertNotNull(empRepo.findById(13L).get());
		
	}
	
	@Test
	public void testReadAll() {
		List<Employee> list = empRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
		
	}
	@Test
	public void testSingleEmployee() {
		Employee employee = empRepo.findById(4L).get();
		assertEquals("Java", employee.getFirstName());
	}
	
	@Test
	public void testUpdate() {
		Employee emp = empRepo.findById(8L).get();
//		emp.setLastName("Cheriben");
		emp.setEmail("CheribenJ@gmail.com");
		empRepo.save(emp);
		assertNotEquals("jambo@gmail.com", empRepo.findById(8L).get().getEmail());
	}
	
	@Test
	public void testDelete() {
		empRepo.deleteById(2L);
		assertThat(empRepo.existsById(2L)).isFalse();
	}

}
