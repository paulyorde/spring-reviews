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
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String imageUrl;
	private String content;
	
	@OneToMany(mappedBy = "review", fetch = FetchType.EAGER)
	private Collection<Category> categories;
	
	protected Review() {}
	
	public Review(String title, String imageUrl, String content) {
		this(title, imageUrl, content, Collections.emptyList());
	}
	
	public Review(String title, String img, String content, Collection<Category> categories)  {
		this.title = title;
		this.imageUrl = img;
		this.content = content;
		this.categories = categories;
	}
	
	@Override
	public String toString() {
		return String.format("Review[id=%d, title='%s', content='%s', categories: %s]", id, title, content,
				categories);
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
	
	public Collection<Category> getCategories() {
		return categories;
	}
	
	
	
}
