package review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Review review;

	private String reviewNumber;

	private Category() {
	}

	public Category(String reviewNumber) {
		this.reviewNumber = reviewNumber;
	}

	public String getReviewNumber() {
		return reviewNumber;
	}

	public Review getReview() {
		return review;
	}
	
	@Override
	public String toString() {
		return "Review# " + reviewNumber;
	}
}
