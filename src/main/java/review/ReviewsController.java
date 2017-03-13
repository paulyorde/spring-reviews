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
	
	@RequestMapping("/showReviews")
    public String showReviews(String name, Model model) {
        model.addAttribute("reviews", reviews.findAll());
        return "reviews";
    }
	
	@RequestMapping("/showReview")
    public String showReview(@RequestParam(value="id", required=true)Long id, Model model) {
		model.addAttribute("review", reviews.findOne(id));
        return "review";
    }
}









