import java.util.*;

public class employees {
	int emp_id,Hours_worked,Wage_per_hour;  
	String name; 
	  
	//Getter and setters for getting and setting properties  
			public int getEmp_id() {  
			    return emp_id;  
			}  
			public void setEmp_id(int emp_id) {  
			    this.emp_id = emp_id;  
			} 
			
			public int getHours_worked() {  
			    return Hours_worked;  
			}  
			public void setHours_worked(int Hours_worked) {  
			    this.Hours_worked = Hours_worked;  
			}  
			
			public int getWage_per_hour() {  
			    return Wage_per_hour;  
			}  
			public void setWage_per_hour(int Wage_per_hour) {  
			    this.Wage_per_hour = Wage_per_hour;  
			} 
			
			public String getName() {  
			    return name;  
			}  
			public void setName(String name) {  
			    this.name = name;  
			}  
			
			@Override  
			public String toString() {  
			    return "Employee [emp_id = " + emp_id + ", Wage_per_hour = " + Wage_per_hour+"  "+"Hours_worked="+Hours_worked+ ", name = " + name +  "]";  
			    }  


}

