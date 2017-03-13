package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TechController {
	
	@Resource
	private TechRepository techReviews;
	
	@RequestMapping("/showTechReviews")
    public String showReviews(String name, Model model) {
        model.addAttribute("techReviews", techReviews.findAll());
        return "tech-reviews";
    }
	
	@RequestMapping("/showTechReview")
    public String showReview(@RequestParam(value="id", required=true)Long id, Model model) {
		model.addAttribute("techReviews", techReviews.findOne(id));
        return "tech-review";
    }
}
