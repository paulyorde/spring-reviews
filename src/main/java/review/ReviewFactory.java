package review;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewFactory {
	private Map<Long, Review> reviews = new HashMap<>();

	
	
	static Review createReview() {
		return new Review(1l, "title", "img", "cat", "content");
	}
}
