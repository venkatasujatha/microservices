package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.Model.Department;
import com.tectoro.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/save")
	public Department save(@RequestBody Department department)
	{
		return departmentService.save(department);
	}
	@GetMapping("/get/{id}")
	public Department getDepartment(@PathVariable("id") int id)
	{
		return departmentService.getDepartment(id);
	}
}


