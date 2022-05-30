package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tectoro.Model.Department;
import com.tectoro.Model.User1;
import com.tectoro.Service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	@PostMapping("/saved")
	public Object save(@RequestBody User1 user)
	{
		return userService.save(user);
	}
	@GetMapping("/get1/{uid}")
	public User1 getUserWithDepartment(@PathVariable("uid") int uid)
	{
		User1 user1 =userService.getUserWithDepartment(uid);
		
		/*
		 * Department department=this.restTemplate.getForObject(
		 * "http://localhost:9090/DEPARTMENT-SERVICE/department/get/"+uid,Department.
		 * class );
		 * 
		 * System.out.println(department.getDepartmentaddress());
		 * user1.setDepartment(department);
		 */
		return  user1;
		
	}
	
}
