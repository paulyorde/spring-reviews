package review;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLogger implements CommandLineRunner {
	
private static Logger log = LoggerFactory.getLogger(DataLogger.class);
	
	//often done like this:
	// private Logger log = LoggerFactory.getLogger(getClass());
	
	private ReviewRepository customerRepo;

	private CategoryRepository orderRepo;
	
	public DataLogger(ReviewRepository customerRepo, CategoryRepository orderRepo) {
		this.customerRepo = customerRepo;
		this.orderRepo = orderRepo;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Iterable<Review> customers = customerRepo.findAll();
		log.info("Reviews:");
		for(Review customer: customers) {
			log.info(customer.toString());
		}
		
		Iterable<Category> orders = orderRepo.findAll();
		log.info("Orders:");
		for(Category order: orders) {
			String msg = String.format("%s for customer %s", order, order.getReview());
			log.info(msg);
		}
	}


}
