package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 System.out.print("Input value of a>");
         double a = Double.parseDouble(scan.next());
         System.out.print("Input value of h>");
         double h = Double.parseDouble(scan.next());
         
         Differential_lib dlib = new Differential_lib(a,h); 
         System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŠÖ”‚Í"+dlib.getRx());
         System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŠÖ”‚Í"+dlib.getDx());
         System.out.println("f(x)=x^2‚Ìx="+a+",h="+h+"‚É‚¨‚¯‚é‘Š‘ÎŒë·‚Í="+dlib.getRelationerror());
	}

}
