package review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String imageUrl;
	private String content;
	
	@ManyToOne
	private Category category;
	
	protected Review() {}

	public Review(String title, String img, String content, Category category)  {
		this.title = title;
		this.imageUrl = img;
		this.content = content;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return String.format("Review[title='%s', content='%s', categories: %s]",  title, content,
				category.getTitle());
	}

	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getContent() {
		return content;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public Long getCategoryID() {
		return category.getId();
	}

}
