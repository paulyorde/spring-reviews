package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {
	
	@Resource
	private ReviewRepository reviews;
	
	@Resource 
	private CategoryRepository categories;
	
	@RequestMapping("/showReviews")
    public String showReviews(String name, Model model) {
        model.addAttribute("reviews", reviews.findAll());
        model.addAttribute("categories", categories.findAll());
        return "reviews";
    }
	
	@RequestMapping("/showReview")
    public String showReview(@RequestParam(value="id", required=true)Long id, Model model) {
		model.addAttribute("review", reviews.findOne(id));
		model.addAttribute("categories", categories.findAll());
		model.addAttribute("category", categories.findOne(id));
        return "review";
    }
}









