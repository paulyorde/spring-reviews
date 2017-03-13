package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RocketController {
	@Resource
	private RocketRepository rocketReviews;
	
	@RequestMapping("/showRocketReviews")
    public String showReviews(String name, Model model) {
        model.addAttribute("rocketReviews", rocketReviews.findAll());
        return "rocket-reviews";
    }
	
	@RequestMapping("/showRocketReview")
    public String showReview(@RequestParam(value="id", required=true)Long id, Model model) {
		model.addAttribute("rocketReviews", rocketReviews.findOne(id));
        return "rocket-review";
    }
}
