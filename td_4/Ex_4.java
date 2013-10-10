package td_4;
import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);

		System.out.println("Consecutively give positive integers; to stop type '0'.");
		int n=1;
		double input1=0;
		double input2=0;
		int i=0;
		double sigma=0;
		double E1;
		double E2;
		do{	
			n=in.nextInt();
			if(n!=0){
				input1+=Math.pow(n, 2);
				input2+=n;
				i++;
				E1=input1/i;
				E2=Math.pow(input2/i, 2);
				sigma=Math.sqrt(E1-E2);
			}		
		}while(n!=0);
				
		
		System.out.println("The standart deviation of your numbers is: "+sigma);
		
		
		//----------------------------------------------
		in.close();
	}

}
