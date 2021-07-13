
public class wages {

	public static void main(String[] args) {

		employees e1=new employees();
		e1.setEmp_id(1);
		e1.setHours_worked(19);
		e1.setWage_per_hour(109);
		e1.setName("saniya");
		System.out.println(e1);
		
		int ans=e1.Hours_worked*e1.Wage_per_hour;
		System.out.println("Salary: "+ans);
		
	}

}
