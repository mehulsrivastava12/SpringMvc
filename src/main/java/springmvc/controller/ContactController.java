package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with Id "+createdUser);
		return "success";
	}	
}
	
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(
//			@RequestParam("email") String userEmail,
//			@RequestParam("userName") String userName,
//			@RequestParam("password") String userPassword,
//			Model model) {
//		
//		User user=new User();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(userPassword);
//		
//		System.out.println(user);
//		model.addAttribute("user",user);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("name", userName);
//		model.addAttribute("password",userPassword);
//		return "success";
//	}

