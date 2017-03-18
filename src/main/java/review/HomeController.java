package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@Resource
	private ReviewRepository reviews;
	
	@Resource 
	private CategoryRepository categories;

	@RequestMapping(method= RequestMethod.GET)
	public String getHome(String name, Model model) {
        model.addAttribute("reviews", reviews.findAll());
        model.addAttribute("categories", categories.findAll());
        return "index";
    }
}
