package MatillionTest;
import java.sql.*;
import java.util.Scanner;

public class MySqlQuery {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please specify the department (HQ General Management, HQ Marketing, Temp Checkers etc).");
		String department = scan.nextLine();
		
		System.out.println("Enter the Pay type of the employee, e.g. Monthly, Hourly ");
		String payType= scan.nextLine();
		
		System.out.println("Enter the Education Level of the Employee, eg. Graduate Degree, Bachelors Degree etc. ");
		String educationLvl= scan.nextLine();
		
		
		
			String driver = "com.mysql.jdbc.Driver";
	        String db = "foodmart";
	        String url = "jdbc:mysql://localhost/" + db;
	        String user = "root";
	        String pass = "zarrar";
	        
	        //It is essential to type in the right entry here. I have not put in checks for invalid entry because of lack of time...
	        //lower and upper cases do not matter, as long as the spelling is right.
	        
	        String sql= "Select * from foodmart.department, foodmart.employee, foodmart.position "
	        		+"WHERE department.department_id= employee.department_id "
	        		+"ANd employee.position_id = position.position_id "
	        		+"AND department_description = ? "
	        		+"AND position.pay_type = ? " 
	        		+"AND employee.education_level = ? ";
	        		
	   	
	        		
	        		
		try {
			
			//1. Get a Connection to DB
			Connection myConn=DriverManager.getConnection(url, user, pass);
			System.out.println("Connected to database : " + db);
			
			//2. Create a Statement
			
			PreparedStatement preStatement = myConn.prepareStatement(sql);
			preStatement.setString(1, department);
			preStatement.setString(2, payType);
			preStatement.setString(3, educationLvl);
			
			//3. Execute SQL query
			ResultSet myRs = preStatement.executeQuery();
			
			
			//4. Process the result set
			System.out.println("Full Name||Department Description||Pay Type||Education Level");
			while(myRs.next()) {
				System.out.println("_______________________________________________________");
				System.out.println(myRs.getString("full_name")+ "| "+ myRs.getString("department_description")+"| "
									+ myRs.getString("pay_type") +"| " +myRs.getString("education_level"));
				System.out.println("_______________________________________________________");
			}
			
			
			
			
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	
}
