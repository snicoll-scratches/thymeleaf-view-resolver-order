package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Stephane Nicoll
 */
@Controller
class HomeController {

	@RequestMapping("/")
	String index() {
		return "index";
	}

}