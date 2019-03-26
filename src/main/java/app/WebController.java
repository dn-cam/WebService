package app;
/**
 * 
 */


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


/**
 * @author camelliadebnath
 * 26-Mar-2019
 */


@RestController
public class WebController {

	@RequestMapping("/home")
	public String home() {
		return "Welcome to the Employee Portal";
	}
	
	
	/**
	 * Controller Method to get the name of all the employees
	 */	
	@RequestMapping("/employees")
	public List<String> employenames() {
		WebDao dao = new WebDao();
		List<Employee> list = dao.fetchData();
		List<String> names = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			names.add(list.get(i).firstName);
		}
		return names;
	}
	
	/**
	 * Controller Method to get the highest Paid Employee
	 */
	@RequestMapping("/highest")
	public String highest() {
		WebDao dao = new WebDao();
		String name = dao.getHighest();
		return name;
	}

	/**
	 * Controller Method to get the top N Paid Employees
	 */
	@GetMapping("/topN/{no}")
	public List<String> getTopNEmployees(@PathVariable int no) {

		List<String> names = new ArrayList<String>();
		WebDao dao = new WebDao();
		names = dao.getTopN(no);
		return names;

	}

	/**
	 * Controller Method to get the lowest N Paid Employees
	 */
	@GetMapping("/bottomN/{no}")
	public List<String> getBottomNEmployees(@PathVariable int no) {

		List<String> names = new ArrayList<String>();
		WebDao dao = new WebDao();
		names = dao.getBottomN(no);
		return names;

	}

}
