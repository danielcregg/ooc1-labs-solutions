package ie.gmit.javalabs.lab10abstraction.account.employee;

public class EmployeeDriver {

	   public static void main(String [] args) {
	      /* Following is not allowed and would raise error */
	      Employee e = new EmployeeSubClass("George W.", "Houston, TX", 43);
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	      e.computePay();
	      
	   }
	}
