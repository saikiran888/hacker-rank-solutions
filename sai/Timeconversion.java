package sai;
import java.util.*;
public class Timeconversion {
	public static void main(String  arg[]) {
		int hr,min,ss;
		Scanner sc =new Scanner(System.in);
		 hr=sc.nextInt();
		 min=sc.nextInt();
		 ss=sc.nextInt();
		String n=sc.nextLine();
		if(n=="PM") {
			hr+=12;
		}
	System.out.println(hr+":"+min+":"+ss);
				
	}

}
