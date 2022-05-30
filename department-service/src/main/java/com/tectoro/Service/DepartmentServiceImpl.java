package com.tectoro.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.Model.Department;
import com.tectoro.Repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepo;

	@Override
	public Department save(Department department) {
		
		return departmentRepo.save(department);
	}

	@Override
	public Department getDepartment(int id) {
		
		return departmentRepo.findById(id);
	}

	
}
