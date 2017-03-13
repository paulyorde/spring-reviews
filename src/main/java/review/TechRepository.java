package review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class TechRepository {
	private Map<Long, Review> techRepos = new HashMap<>();
	
	public TechRepository() {
		techRepos.put(5L, new Review(
				5l,"aliquid","images/tech2.png","techFYI","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		techRepos.put(6L, new Review(
				6l,"atque again once more","images/tech2.png","techFYI","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		techRepos.put(7L, new Review(
				7l,"nulla","images/tech2.png","techFYI","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
		techRepos.put(8L, new Review(
				8l,"Quos cum ex quis","images/tech2.png","techFYI","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
	}
	
	public Collection<Review> findAll() {
		return techRepos.values();
	}
	
	public Review findOne(Long id) {
		return techRepos.get(id);
	}
}






