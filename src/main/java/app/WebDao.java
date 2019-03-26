/**
 * 
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.stream.Collectors;


/**
 * @author camelliadebnath 26-Mar-2019
 */
public class WebDao {

	public static List<Employee> fetchData() {
		Connection conn = null;
		List<Employee> emplist = new ArrayList<Employee>();
		try {
			String url = "jdbc:sqlite:/Users/camelliadebnath/Documents/db_name.db";
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
			String query = "SELECT * FROM employees";
			String query1 = "SELECT e.firstName, s.salary FROM employees e, salaries s WHERE e.empno = s.empno";

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query1);

			while (rs.next()) {
				String firstName = rs.getString("firstName");
				int salary = rs.getInt("salary");
				emplist.add(new Employee(firstName, salary));

			}
			st.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return emplist;

	}

	public String getHighest() {
		List<Employee> emplist = fetchData();
		Employee e = emplist.stream().max((a, b) -> a.salary.compareTo(b.salary)).get();

		return e.firstName;

	}

	public List<String> getTopN(int n) {
		List<Employee> emplist = fetchData();
		List<Employee> list = emplist.stream()
				.sorted((a, b) -> a.salary.compareTo(b.salary))
				.collect(Collectors.toList());
		
		List<String> highest = new ArrayList<String>();
		for(int i = list.size() - 1; i>= list.size() - n; i--) {
			highest.add(list.get(i).firstName);
		}
		return highest;
	}
	
	public List<String> getBottomN(int n) {
		List<Employee> emplist = fetchData();
		List<Employee> list = emplist.stream()
				.sorted((a, b) -> a.salary.compareTo(b.salary))
				.collect(Collectors.toList());
		
		List<String> lowest = new ArrayList<String>();
		if (n < list.size()) {
			for(int i = 0; i< n; i++) {
				lowest.add(list.get(i).firstName);
			}
		}
		
		return lowest;
	}

}
