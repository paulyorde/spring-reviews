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
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)  
	private Collection<Review> reviews;

	
	private Category() {
	}
	
	public Category(String title) {
		this(title, Collections.emptyList());
	}
	
	public Category(String title, Collection<Review> reviews) {
		this.title = title;
		this.reviews = reviews;
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
	
	
	
	
//	@Override
//	public String toString() {
//		return "Review# " + reviewNumber;
//	}
}
