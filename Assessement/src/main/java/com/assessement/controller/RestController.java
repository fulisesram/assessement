package com.assessement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.assessement.model.User;
import com.assessement.service.UserServiceImpl;

@Controller
public class RestController {

	@Autowired
	private UserServiceImpl userService;
	

		@GetMapping("/list")  
		public String list(Model model) {   
			List<User> users = (List<User>) userService.listUser();
			model.addAttribute("users", users); 
			return "/list";
		}
		
		@GetMapping("/add")
		public String add(User user) {
			return "add";
		}
		//Mapping edit	
		@GetMapping("edit/{idUser}")
		public String edit(User user, Model model) {
		user = userService.findUser(user);
		model.addAttribute(user);
		return "edit";
		}

		
		@PostMapping("/save")
		public String save(User user) {   
			userService.saveUser(user);
			return "save"; 
		}
		
		
		@GetMapping("/delete")
		public String delete(User user) {
			userService.deleteUser(user);
			return "delete"; 
		}
	
}


/* @Autowired
*  private UserServiceImpl userService; => Service service = new ServiceImpl(); 
* 
*/