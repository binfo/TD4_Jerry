package td_4;
import java.util.Scanner;
public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		System.out.println("Give two positive non-zero integers:");
		
		int a=in.nextInt();
		int b=in.nextInt();
		int temp;
		do{
			temp=a%b;
			a=b;b=temp;
		}while(temp!=0);
		
		System.out.println("The GCD of your 2 numbers is: "+a);
		
		
		//---------------------------------------------------------------------------------------
		in.close();
	}

}
