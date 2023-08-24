package ServerProgramming.ControllerAndEndpoints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controllerAndRequest {

	@RequestMapping("index")
	@ResponseBody
	public String showIndexPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String showHelloPage(@RequestParam (name="location") String location, @RequestParam (name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}
