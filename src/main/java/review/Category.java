package review;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	private String imageUrl;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)  
	private Collection<Review> reviews;

	
	private Category() {
	}
	
	public Category(String title, String description, String img) {
		this(title, description, img, Collections.emptyList());
	}
	
	public Category(String title, String description, String img, Collection<Review> reviews) {
		this.title = title;
		this.reviews = reviews;
		this.description = description;
		this.imageUrl = img;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

}
