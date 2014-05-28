package in.songcovers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/getProjectName")
	public String getProjectName() {
		System.out.println("INSIDE");
		return "/pages/about_us.html";
	}

}
