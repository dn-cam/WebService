package app;
/**
 * 
 */

/**
 * @author camelliadebnath
 * 26-Mar-2019
 */
public class Employee {
		Integer employeeNo;
		String birthdate;
		String firstName;
		String lastName;
		Integer salary;
		
		enum Gender 
		{ 
		    M, F; 
		} 
		
		String hireDate;

		public Employee( String firstName, Integer salary) {
			this.firstName = firstName;
			this.salary = salary;
		}

		/**
		 * @return the employeeNo
		 */
		public Integer getEmployeeNo() {
			return employeeNo;
		}


		/**
		 * @param employeeNo the employeeNo to set
		 */
		public void setEmployeeNo(Integer employeeNo) {
			this.employeeNo = employeeNo;
		}


		/**
		 * @return the birthdate
		 */
		public String getBirthdate() {
			return birthdate;
		}


		/**
		 * @param birthdate the birthdate to set
		 */
		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}


		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}


		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}


		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			lastName = lastName;
		}


		/**
		 * @return the hireDate
		 */
		public String getHireDate() {
			return hireDate;
		}


		/**
		 * @param hireDate the hireDate to set
		 */
		public void setHireDate(String hireDate) {
			this.hireDate = hireDate;
		}
		
		

	}


