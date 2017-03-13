package review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class RocketRepository {
private Map<Long, Review> rocketReviews = new HashMap<>();
	
	public RocketRepository() {
		rocketReviews.put(9L, new Review(
				9l,"Consectetur","images/tech2.png","rocket reviews","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		rocketReviews.put(10L, new Review(
				10l,"Adipiscing","images/tech2.png","rocket reviews","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		rocketReviews.put(11L, new Review(
				11l,"elit","images/tech2.png","rocket reviews","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		rocketReviews.put(12L, new Review(
				12l,"Reiciendis","images/tech2.png","rocket reviews","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
	}
	
	public Collection<Review> findAll() {
		return rocketReviews.values();
	}
	
	public Review findOne(Long id) {
		return rocketReviews.get(id);
	}
}
