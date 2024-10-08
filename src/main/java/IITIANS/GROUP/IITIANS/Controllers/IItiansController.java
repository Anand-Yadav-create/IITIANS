package IITIANS.GROUP.IITIANS.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller


public class IItiansController {
	
	


	
		

	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/base")
	public String base() {
		return "base";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/question")
	public String question() {
		return "question";
	}
	
	@GetMapping("/help")
	public String help() {
		return "help";
	}
	
@RequestMapping("/semester/{id}")
	
	public String editBook(@PathVariable("id") int id) {
	
	
	
	if(id==1) {
		return "sem1";
	}
	else if(id==2) {
		
		return "sem2";
	}
else if(id==3) {
		
		return "sem3";
	}
else if(id==4) {
	
	return "sem4";
}
else if(id==5) {
	
	return "sem5";
}
else if(id==6) {
	
	return "sem6";
}
else if(id==7) {
	
	return "sem7";
}
		
		
	else if(id==8) {	
		return "sem8";
	}
	return "hel";
	}

@RequestMapping("/paper/{id}")

public String paper(@PathVariable("id") String id,Model model) {
	
	model.addAttribute("idt",id);
	model.addAttribute("th",id+"1");



   return "paper";
}
@GetMapping("/courses")
public String courses() {
	return "Courses";
}
@GetMapping("/coding")
public String coding() {
	return "Coding";
}


}
