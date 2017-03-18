package review;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	Iterable<Category> findAll();
	Category findByTitle(String title);

	  //List<Employee> findByLastName(String lastName);
}
