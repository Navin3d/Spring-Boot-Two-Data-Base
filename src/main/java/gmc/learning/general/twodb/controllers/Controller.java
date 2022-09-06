package gmc.learning.general.twodb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gmc.learning.general.twodb.models.Employee;
import gmc.learning.general.twodb.models.User;
import gmc.learning.general.twodb.repositories.EmployeeRepository;
import gmc.learning.general.twodb.repositories.UserRepository;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@PostMapping(path = "/user")
	private String createUser(@RequestBody User user) {
		userRepo.insert(user);
		return "Saved";
	}
	
	@PostMapping(path = "/employee")
	private String createProduct(@RequestBody Employee employee) {
		employeeRepo.insert(employee);
		return "Saved";
	}

}
