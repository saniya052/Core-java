import java.util.*;

public class emp {
	
		public float emp() {
			  Scanner sc=new Scanner(System.in);
				System.out.print(":");
				float r=sc.nextInt();
				return r;
		}
		/*float  det() {
		    Scanner sc=new Scanner(System.in);
			System.out.print(":");
			float r=sc.nextInt();
			return r;
		}
		*/
		int area1(float r) {
			float ans=(float) (3.14*r*r);
			return (int) ans;
		}
		
		void cir(float r) {
			float ans=(float) (2*3.24*r);
			System.out.print(":"+ans);
		}

	
}
