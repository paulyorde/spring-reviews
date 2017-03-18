package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryRepository categories;
	
	@Resource
	private ReviewRepository reviews;
	
	@RequestMapping("/showCategories")
    public String showCategories(String name, Model model) {
        model.addAttribute("categories", categories.findAll());
        return "categories";
    }
	
	@RequestMapping("/showCategory")
    public String showCategory(@RequestParam(value="id", required=true)Long id, Model model) {
		model.addAttribute("category", categories.findOne(id));
        return "reviews";
    }
}
