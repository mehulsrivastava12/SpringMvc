package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name", "Mehul");
		model.addAttribute("id", 1);
		List<String> friends= new ArrayList<String>();
		friends.add("Sharad");
		friends.add("Tushar");
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.addObject("name", "Mehul");
		LocalDateTime now=LocalDateTime.now();
		modelandview.addObject("time", now);
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		modelandview.addObject("l",list);
		modelandview.setViewName("help");
		return modelandview;
	}
}
