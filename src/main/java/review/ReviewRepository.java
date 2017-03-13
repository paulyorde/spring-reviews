package review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	private Map<Long, Review> reviews = new HashMap<>();
	
	public ReviewRepository() {
		reviews.put(1L, new Review(
				1l,"Lorem","images/tech2.png","modern sci-fi","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		reviews.put(2L, new Review(
				2l,"ipsum","images/tech2.png","modern sci-fi","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		reviews.put(3L, new Review(
				3l,"dolor","images/tech2.png","modern sci-fi","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		reviews.put(4L, new Review(
				4l,"sit amet","images/tech2.png","modern sci-fi","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
	}
	
	public Collection<Review> findAll() {
		return reviews.values();
	}
	
	public Review findOne(Long id) {
		return reviews.get(id);
	}
	
}
